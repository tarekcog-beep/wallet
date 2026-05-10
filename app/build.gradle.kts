// Copyright 2025 MyCompany
plugins {
    id("walletapp.android.application")
    id("walletapp.android.compose")
    id("walletapp.android.hilt")
}

android {
    namespace = "com.tarek.wallet"

    defaultConfig {

        applicationId = "com.tarek.wallet"
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(projects.coreDesignsystem)
    implementation(projects.coreUi)
    implementation(projects.featureExample)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.hilt.navigation.compose)

    // Runtime side of the baseline-profile pipeline. Without this dep, the
    // committed `baseline-prof.txt` ships in the APK but is never installed
    // on user devices.
    implementation(libs.androidx.profileinstaller)

    // Producer module that generates `baseline-prof.txt`. Regenerate via
    // `./gradlew :app:generateReleaseBaselineProfile`.
    "baselineProfile"(projects.baselineprofile)

    testImplementation(projects.coreTesting)
    androidTestImplementation(projects.coreTesting)
}
