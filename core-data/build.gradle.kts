// Copyright 2025 MyCompany
plugins {
    id("walletapp.android.library")
    id("walletapp.android.hilt")
}

android {
    namespace = "com.tarek.wallet.core.data"
}

dependencies {
    implementation(projects.coreDatabase)

    implementation(libs.androidx.core.ktx)

    testImplementation(projects.coreTesting)
    androidTestImplementation(projects.coreTesting)
}
