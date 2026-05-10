// Copyright 2026 MyCompany
import com.android.build.api.dsl.TestExtension
import com.tarek.wallet.buildlogic.configureBuildFeatures
import com.tarek.wallet.buildlogic.configureKotlinAndroid
import com.tarek.wallet.buildlogic.configureManagedDevices

plugins {
    // AGP 9+ bundles Kotlin support — `org.jetbrains.kotlin.android` removed.
    id("com.android.test")
}

extensions.configure<TestExtension> {
    configureKotlinAndroid(this)
    defaultConfig.targetSdk = 36
    configureBuildFeatures()
    // Macrobenchmark + baseline profile generation runs against a GMD; share
    // the same `pixel6api30` device the application/library conventions use
    // so adopters have one entry-point AVD to install/cache locally and in CI.
    configureManagedDevices()
}
