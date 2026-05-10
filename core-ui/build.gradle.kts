// Copyright 2025 MyCompany
plugins {
    id("walletapp.android.library")
    id("walletapp.android.compose")
    id("walletapp.android.hilt")
}

android {
    namespace = "com.tarek.wallet.core.ui"
}

dependencies {
    implementation(libs.androidx.core.ktx)

    testImplementation(projects.coreTesting)
    androidTestImplementation(projects.coreTesting)
}
