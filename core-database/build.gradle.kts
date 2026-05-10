// Copyright 2025 MyCompany
plugins {
    id("walletapp.android.library")
    id("walletapp.android.hilt")
    id("walletapp.android.room")
}

android {
    namespace = "com.tarek.wallet.core.database"
}

dependencies {
    implementation(libs.androidx.core.ktx)

    testImplementation(projects.coreTesting)
    androidTestImplementation(projects.coreTesting)
}
