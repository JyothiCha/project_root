plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(30)  // Specify the SDK version

    defaultConfig {
        applicationId = "com.example.myapp"
        minSdkVersion(21)
        targetSdkVersion(30)

        versionCode = 3
        versionName = "13.0.0"  // Starting version name (to be set by your script)

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            minifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    // Other dependencies
}
