// Copyright 2014 The Bazel Authors. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.google.devtools.build.lib.rules.cpp;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.devtools.build.lib.actions.Artifact;
import com.google.devtools.build.lib.analysis.config.BuildOptions;
import com.google.devtools.build.lib.collect.nestedset.NestedSet;
import com.google.devtools.build.lib.collect.nestedset.NestedSetBuilder;
import com.google.devtools.build.lib.collect.nestedset.Order;
import com.google.devtools.build.lib.packages.RuleErrorConsumer;
import com.google.devtools.build.lib.rules.cpp.CcToolchainFeatures.FeatureConfiguration;
import com.google.devtools.build.lib.rules.cpp.CcToolchainVariables.StringSequenceBuilder;
import com.google.devtools.build.lib.rules.cpp.CcToolchainVariables.VariablesExtension;
import com.google.devtools.build.lib.syntax.EvalException;
import com.google.devtools.build.lib.syntax.Location;
import com.google.devtools.build.lib.vfs.PathFragment;
import java.util.List;
import java.util.Map;

/** Enum covering all build variables we create for all various {@link CppCompileAction}. */
public enum CompileBuildVariables {
  /** Variable for the path to the source file being compiled. */
  SOURCE_FILE("source_file"),
  /**
   * Variable for all flags coming from copt rule attribute, and from --copt, --cxxopt, or
   * --conlyopt options.
   */
  USER_COMPILE_FLAGS("user_compile_flags"),
  /** Variable for flags coming from unfiltered_cxx_flag CROSSTOOL fields. */
  UNFILTERED_COMPILE_FLAGS("unfiltered_compile_flags"),
  /** Variable for the path to the compilation output file. */
  OUTPUT_FILE("output_file"),
  /** Variable for the dependency file path */
  DEPENDENCY_FILE("dependency_file"),
  /** Variable for the module file name. */
  MODULE_NAME("module_name"),
  /**
   * Variable for the collection of include paths.
   *
   * @see CcCompilationContext#getIncludeDirs().
   */
  INCLUDE_PATHS("include_paths"),
  /**
   * Variable for the collection of quote include paths.
   *
   * @see CcCompilationContext#getQuoteIncludeDirs().
   */
  QUOTE_INCLUDE_PATHS("quote_include_paths"),
  /**
   * Variable for the collection of system include paths.
   *
   * @see CcCompilationContext#getSystemIncludeDirs().
   */
  SYSTEM_INCLUDE_PATHS("system_include_paths"),
  /**
   * Variable for the collection of framework include paths.
   *
   * @see CcCompilationContext#getFrameworkIncludeDirs().
   */
  FRAMEWORK_PATHS("framework_include_paths"),
  /** Variable for the module map file name. */
  MODULE_MAP_FILE("module_map_file"),
  /** Variable for the dependent module map file name. */
  DEPENDENT_MODULE_MAP_FILES("dependent_module_map_files"),
  /** Variable for the collection of module files. */
  MODULE_FILES("module_files"),
  /** Variable for the collection of macros defined for preprocessor. */
  PREPROCESSOR_DEFINES("preprocessor_defines"),
  /** Variable for the gcov coverage file path. */
  GCOV_GCNO_FILE("gcov_gcno_file"),
  /** Variable for the LTO indexing bitcode file. */
  LTO_INDEXING_BITCODE_FILE("lto_indexing_bitcode_file"),
  /** Variable marking fission is used. */
  IS_USING_FISSION("is_using_fission"),
  /** Variable for the per object debug info file. */
  PER_OBJECT_DEBUG_INFO_FILE("per_object_debug_info_file"),
  /** Variable present when the output is compiled as position independent. */
  PIC("pic"),
  /** Variable marking that we are generating preprocessed sources (from --save_temps). */
  OUTPUT_PREPROCESS_FILE("output_preprocess_file"),
  /** Variable marking that we are generating assembly source (from --save_temps). */
  OUTPUT_ASSEMBLY_FILE("output_assembly_file"),
  /** Path to the fdo instrument artifact */
  FDO_INSTRUMENT_PATH("fdo_instrument_path"),
  /** Path to the fdo profile artifact */
  FDO_PROFILE_PATH("fdo_profile_path"),
  /** Path to the context sensitive fdo instrument artifact */
  CS_FDO_INSTRUMENT_PATH("cs_fdo_instrument_path"),
  /** Path to the cache prefetch profile artifact */
  FDO_PREFETCH_HINTS_PATH("fdo_prefetch_hints_path"),
  /** Variable for includes that compiler needs to include into sources. */
  INCLUDES("includes");

  private final String variableName;

  CompileBuildVariables(String variableName) {
    this.variableName = variableName;
  }

  public static CcToolchainVariables setupVariablesOrReportRuleError(
      RuleErrorConsumer ruleErrorConsumer,
      FeatureConfiguration featureConfiguration,
      CcToolchainProvider ccToolchainProvider,
      BuildOptions buildOptions,
      CppConfiguration cppConfiguration,
      String sourceFile,
      String outputFile,
      String gcnoFile,
      boolean isUsingFission,
      String dwoFile,
      String ltoIndexingFile,
      ImmutableList<String> includes,
      Iterable<String> userCompileFlags,
      CppModuleMap cppModuleMap,
      boolean usePic,
      PathFragment fakeOutputFile,
      String fdoStamp,
      String dotdFileExecPath,
      ImmutableList<VariablesExtension> variablesExtensions,
      ImmutableMap<String, String> additionalBuildVariables,
      Iterable<Artifact> directModuleMaps,
      NestedSet<PathFragment> includeDirs,
      NestedSet<PathFragment> quoteIncludeDirs,
      NestedSet<PathFragment> systemIncludeDirs,
      NestedSet<PathFragment> frameworkIncludeDirs,
      NestedSet<String> defines,
      Iterable<String> localDefines) {
    try {
      if (usePic
          && !featureConfiguration.isEnabled(CppRuleClasses.PIC)
          && !featureConfiguration.isEnabled(CppRuleClasses.SUPPORTS_PIC)) {
        throw new EvalException(Location.BUILTIN, CcCommon.PIC_CONFIGURATION_ERROR);
      }
      return setupVariables(
          featureConfiguration,
          ccToolchainProvider.getBuildVariables(buildOptions, cppConfiguration),
          sourceFile,
          outputFile,
          gcnoFile,
          isUsingFission,
          dwoFile,
          ltoIndexingFile,
          includes,
          userCompileFlags,
          cppModuleMap,
          usePic,
          toPathString(fakeOutputFile),
          fdoStamp,
          dotdFileExecPath,
          variablesExtensions,
          additionalBuildVariables,
          directModuleMaps,
          getSafePathStrings(includeDirs),
          getSafePathStrings(quoteIncludeDirs),
          getSafePathStrings(systemIncludeDirs),
          getSafePathStrings(frameworkIncludeDirs),
          defines,
          localDefines);
    } catch (EvalException e) {
      ruleErrorConsumer.ruleError(e.getMessage());
      return CcToolchainVariables.EMPTY;
    }
  }

  public static CcToolchainVariables setupVariablesOrThrowEvalException(
      FeatureConfiguration featureConfiguration,
      CcToolchainProvider ccToolchainProvider,
      BuildOptions buildOptions,
      CppConfiguration cppConfiguration,
      String sourceFile,
      String outputFile,
      String gcnoFile,
      boolean isUsingFission,
      String dwoFile,
      String ltoIndexingFile,
      ImmutableList<String> includes,
      Iterable<String> userCompileFlags,
      CppModuleMap cppModuleMap,
      boolean usePic,
      String fakeOutputFile,
      String fdoStamp,
      String dotdFileExecPath,
      ImmutableList<VariablesExtension> variablesExtensions,
      ImmutableMap<String, String> additionalBuildVariables,
      Iterable<Artifact> directModuleMaps,
      NestedSet<String> includeDirs,
      NestedSet<String> quoteIncludeDirs,
      NestedSet<String> systemIncludeDirs,
      NestedSet<String> frameworkIncludeDirs,
      NestedSet<String> defines,
      Iterable<String> localDefines)
      throws EvalException {
    if (usePic
        && !featureConfiguration.isEnabled(CppRuleClasses.PIC)
        && !featureConfiguration.isEnabled(CppRuleClasses.SUPPORTS_PIC)) {
      throw new EvalException(Location.BUILTIN, CcCommon.PIC_CONFIGURATION_ERROR);
    }
    return setupVariables(
        featureConfiguration,
        ccToolchainProvider.getBuildVariables(buildOptions, cppConfiguration),
        sourceFile,
        outputFile,
        gcnoFile,
        isUsingFission,
        dwoFile,
        ltoIndexingFile,
        includes,
        userCompileFlags,
        cppModuleMap,
        usePic,
        fakeOutputFile,
        fdoStamp,
        dotdFileExecPath,
        variablesExtensions,
        additionalBuildVariables,
        directModuleMaps,
        includeDirs,
        quoteIncludeDirs,
        systemIncludeDirs,
        frameworkIncludeDirs,
        defines,
        localDefines);
  }

  private static CcToolchainVariables setupVariables(
      FeatureConfiguration featureConfiguration,
      CcToolchainVariables parent,
      String sourceFile,
      String outputFile,
      String gcnoFile,
      boolean isUsingFission,
      String dwoFile,
      String ltoIndexingFile,
      ImmutableList<String> includes,
      Iterable<String> userCompileFlags,
      CppModuleMap cppModuleMap,
      boolean usePic,
      String fakeOutputFile,
      String fdoStamp,
      String dotdFileExecPath,
      ImmutableList<VariablesExtension> variablesExtensions,
      ImmutableMap<String, String> additionalBuildVariables,
      Iterable<Artifact> directModuleMaps,
      NestedSet<String> includeDirs,
      NestedSet<String> quoteIncludeDirs,
      NestedSet<String> systemIncludeDirs,
      NestedSet<String> frameworkIncludeDirs,
      NestedSet<String> defines,
      Iterable<String> localDefines) {
    CcToolchainVariables.Builder buildVariables = CcToolchainVariables.builder(parent);
    setupCommonVariablesInternal(
        buildVariables,
        featureConfiguration,
        includes,
        cppModuleMap,
        fdoStamp,
        variablesExtensions,
        additionalBuildVariables,
        directModuleMaps,
        includeDirs,
        quoteIncludeDirs,
        systemIncludeDirs,
        frameworkIncludeDirs,
        defines,
        localDefines);
    setupSpecificVariables(
        buildVariables,
        sourceFile,
        outputFile,
        gcnoFile,
        dwoFile,
        isUsingFission,
        ltoIndexingFile,
        userCompileFlags,
        fakeOutputFile,
        dotdFileExecPath,
        usePic,
        ImmutableMap.of());
    return buildVariables.build();
  }

  public static void setupSpecificVariables(
      CcToolchainVariables.Builder buildVariables,
      String sourceFile,
      String outputFile,
      String gcnoFile,
      String dwoFile,
      boolean isUsingFission,
      String ltoIndexingFile,
      Iterable<String> userCompileFlags,
      String fakeOutputFile,
      String dotdFileExecPath,
      boolean usePic,
      Map<String, String> additionalBuildVariables) {
    buildVariables.addStringSequenceVariable(
        USER_COMPILE_FLAGS.getVariableName(), userCompileFlags);

    if (sourceFile != null) {
      buildVariables.addStringVariable(SOURCE_FILE.getVariableName(), sourceFile);
    }

    String fakeOutputFileOrRealOutputFile = fakeOutputFile != null ? fakeOutputFile : outputFile;

    if (outputFile != null) {
      buildVariables.addStringVariable(
          OUTPUT_FILE.getVariableName(), fakeOutputFileOrRealOutputFile);
    }

    // Set dependency_file to enable <object>.d file generation.
    if (dotdFileExecPath != null) {
      buildVariables.addStringVariable(DEPENDENCY_FILE.getVariableName(), dotdFileExecPath);
    }

    if (gcnoFile != null) {
      buildVariables.addStringVariable(GCOV_GCNO_FILE.getVariableName(), gcnoFile);
    }

    if (dwoFile != null) {
      buildVariables.addStringVariable(PER_OBJECT_DEBUG_INFO_FILE.getVariableName(), dwoFile);
    }

    if (isUsingFission) {
      buildVariables.addStringVariable(IS_USING_FISSION.getVariableName(), "");
    }

    if (ltoIndexingFile != null) {
      buildVariables.addStringVariable(
          LTO_INDEXING_BITCODE_FILE.getVariableName(), ltoIndexingFile);
    }

    if (usePic) {
      buildVariables.addStringVariable(PIC.getVariableName(), "");
    }

    buildVariables.addAllStringVariables(additionalBuildVariables);
  }

  public static void setupCommonVariables(
      CcToolchainVariables.Builder buildVariables,
      FeatureConfiguration featureConfiguration,
      List<String> includes,
      CppModuleMap cppModuleMap,
      String fdoStamp,
      List<VariablesExtension> variablesExtensions,
      Map<String, String> additionalBuildVariables,
      Iterable<Artifact> directModuleMaps,
      List<PathFragment> includeDirs,
      List<PathFragment> quoteIncludeDirs,
      List<PathFragment> systemIncludeDirs,
      List<PathFragment> frameworkIncludeDirs,
      NestedSet<String> defines,
      Iterable<String> localDefines) {
    setupCommonVariablesInternal(
        buildVariables,
        featureConfiguration,
        includes,
        cppModuleMap,
        fdoStamp,
        variablesExtensions,
        additionalBuildVariables,
        directModuleMaps,
        getSafePathStrings(includeDirs),
        getSafePathStrings(quoteIncludeDirs),
        getSafePathStrings(systemIncludeDirs),
        getSafePathStrings(frameworkIncludeDirs),
        defines,
        localDefines);
  }

  private static void setupCommonVariablesInternal(
      CcToolchainVariables.Builder buildVariables,
      FeatureConfiguration featureConfiguration,
      List<String> includes,
      CppModuleMap cppModuleMap,
      String fdoStamp,
      List<VariablesExtension> variablesExtensions,
      Map<String, String> additionalBuildVariables,
      Iterable<Artifact> directModuleMaps,
      NestedSet<String> includeDirs,
      NestedSet<String> quoteIncludeDirs,
      NestedSet<String> systemIncludeDirs,
      NestedSet<String> frameworkIncludeDirs,
      NestedSet<String> defines,
      Iterable<String> localDefines) {
    Preconditions.checkNotNull(directModuleMaps);
    Preconditions.checkNotNull(includeDirs);
    Preconditions.checkNotNull(quoteIncludeDirs);
    Preconditions.checkNotNull(systemIncludeDirs);
    Preconditions.checkNotNull(frameworkIncludeDirs);
    Preconditions.checkNotNull(defines);
    Preconditions.checkNotNull(localDefines);

    if (featureConfiguration.isEnabled(CppRuleClasses.MODULE_MAPS) && cppModuleMap != null) {
      // If the feature is enabled and cppModuleMap is null, we are about to fail during analysis
      // in any case, but don't crash.
      buildVariables.addStringVariable(MODULE_NAME.getVariableName(), cppModuleMap.getName());
      buildVariables.addStringVariable(
          MODULE_MAP_FILE.getVariableName(), cppModuleMap.getArtifact().getExecPathString());
      StringSequenceBuilder sequence = new StringSequenceBuilder();
      for (Artifact artifact : directModuleMaps) {
        sequence.addValue(artifact.getExecPathString());
      }
      buildVariables.addCustomBuiltVariable(DEPENDENT_MODULE_MAP_FILES.getVariableName(), sequence);
    }
    if (featureConfiguration.isEnabled(CppRuleClasses.USE_HEADER_MODULES)) {
      // Module inputs will be set later when the action is executed.
      buildVariables.addStringSequenceVariable(MODULE_FILES.getVariableName(), ImmutableSet.of());
    }
    buildVariables.addStringSequenceVariable(INCLUDE_PATHS.getVariableName(), includeDirs);
    buildVariables.addStringSequenceVariable(
        QUOTE_INCLUDE_PATHS.getVariableName(), quoteIncludeDirs);
    buildVariables.addStringSequenceVariable(
        SYSTEM_INCLUDE_PATHS.getVariableName(), systemIncludeDirs);

    if (!includes.isEmpty()) {
      buildVariables.addStringSequenceVariable(INCLUDES.getVariableName(), includes);
    }

    buildVariables.addStringSequenceVariable(
        FRAMEWORK_PATHS.getVariableName(), frameworkIncludeDirs);

    NestedSet<String> allDefines;
    if (fdoStamp != null) {
      // Stamp FDO builds with FDO subtype string
      allDefines =
          NestedSetBuilder.<String>linkOrder()
              .addTransitive(defines)
              .addTransitive(NestedSetBuilder.wrap(Order.STABLE_ORDER, localDefines))
              .add(CppConfiguration.FDO_STAMP_MACRO + "=\"" + fdoStamp + "\"")
              .build();
    } else {
      allDefines =
          NestedSetBuilder.<String>linkOrder()
              .addTransitive(defines)
              .addTransitive(NestedSetBuilder.wrap(Order.STABLE_ORDER, localDefines))
              .build();
    }

    buildVariables.addStringSequenceVariable(PREPROCESSOR_DEFINES.getVariableName(), allDefines);

    buildVariables.addAllStringVariables(additionalBuildVariables);
    for (VariablesExtension extension : variablesExtensions) {
      extension.addVariables(buildVariables);
    }
  }

  /** Get the safe path strings for a list of paths to use in the build variables. */
  private static NestedSet<String> getSafePathStrings(NestedSet<PathFragment> paths) {
    return getSafePathStrings(paths.toList());
  }

  /** Get the safe path strings for a list of paths to use in the build variables. */
  private static NestedSet<String> getSafePathStrings(List<PathFragment> paths) {
    // Using ImmutableSet first to remove duplicates, then NestedSet for smaller memory footprint.
    return NestedSetBuilder.wrap(
        Order.STABLE_ORDER,
        Iterables.transform(ImmutableSet.copyOf(paths), PathFragment::getSafePathString));
  }

  private static String toPathString(PathFragment a) {
    return a == null ? null : a.getSafePathString();
  }

  public String getVariableName() {
    return variableName;
  }
}
