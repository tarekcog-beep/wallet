// Copyright 2025 MyCompany
plugins {
    id("walletapp.android.feature")
}

android {
    namespace = "com.tarek.wallet.feature.example"
}

dependencies {
    implementation(projects.coreData)

    implementation(libs.androidx.core.ktx)
}
