plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("maven-publish")
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

publishing {
    publications {
        create<MavenPublication>("release") {
            afterEvaluate { // Ensures the Android component is properly evaluated
                from(components["release"])
//                println("components: ${components.names}")
            }
            groupId = "com.crystal"
            artifactId = "crystalrangeseekbar"
            version = "v0.0.1"
        }
    }
}

dependencies {
    testImplementation(libs.junit)
    implementation(libs.androidx.appcompat)
}