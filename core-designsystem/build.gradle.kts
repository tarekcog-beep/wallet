// Copyright 2025 MyCompany
plugins {
    id("walletapp.android.library")
    id("walletapp.android.compose")
}

android {
    namespace = "com.tarek.wallet.core.designsystem"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}
