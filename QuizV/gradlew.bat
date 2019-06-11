package com.android.build.gradle;

import com.android.annotations.NonNull;
import com.android.build.gradle.api.ApplicationVariant;
import com.android.build.gradle.api.BaseVariant;
import com.android.build.gradle.api.BaseVariantOutput;
import com.android.build.gradle.internal.ExtraModelInfo;
import com.android.build.gradle.internal.SdkHandler;
import com.android.build.gradle.internal.dependency.SourceSetManager;
import com.android.build.gradle.internal.dsl.BuildType;
import com.android.build.gradle.internal.dsl.ProductFlavor;
import com.android.build.gradle.internal.dsl.SigningConfig;
import com.android.build.gradle.internal.scope.GlobalScope;
import com.android.build.gradle.options.ProjectOptions;
import org.gradle.api.DomainObjectSet;
import org.gradle.api.NamedDomainObjectContainer;
import org.gradle.api.Project;
import org.gradle.api.internal.DefaultDomainObjectSet;

/**
 * The {@code android} extension for application plugins.
 *
 * <p>For the base module, see {@link com.android.build.gradle.BaseExtension}
 *
 * <p>For optional apks, this class is used directly.
 */
public class AppExtension extends TestedExtension {

    private final DefaultDomainObjectSet<ApplicationVariant> applicationVariantList
            = new DefaultDomainObjectSet<ApplicationVariant>(ApplicationVariant.class);

    public AppExtension(
            @NonNull Project project,
            @NonNull ProjectOptions projectOptions,
            @NonNull GlobalScope globalScope,
            @NonNull SdkHandler sdkHandler,
            @NonNull NamedDomainObjectContainer<BuildType> buildTypes,
            @NonNull NamedDomainObjectContainer<ProductFlavor> productFlavors,
            @NonNull NamedDomainObjectContainer<SigningConfig> signingConfigs,
            @NonNull NamedDomainObjectContainer<BaseVariantOutput> buildOutputs,
            @NonNull SourceSetManager sourceSetManager,
            @NonNull ExtraModelInfo extraModelInfo,
            boolean isBaseModule) {
        super(
                project,
                projectOptions,
                globalScope,
                sdkHandler,
                buildTypes,
                productFlavors,
                signingConfigs,
                buildOutputs,
                sourceSetManager,
   