plugins {
    id("com.android.library")
}

android {
    compileSdk = 35
    buildToolsVersion = "35.0.0"

    namespace = "com.crystal.crystalrangeseekbar"

    defaultConfig {
        minSdk = 21
        targetSdk = 35
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    testImplementation(libs.junit)
    implementation(libs.androidx.appcompat)
}