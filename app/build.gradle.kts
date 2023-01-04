plugins {
    id("com.android.application")
    kotlin("android")
    id("com.google.devtools.ksp").version("1.8.0-1.0.8")
}

android {
    namespace = "net.chigita.launchertest"
    compileSdk = 33

    defaultConfig {
        applicationId = "net.chigita.launchertest"
        minSdk = 33
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        compose = true
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0-dev-k1.8.0-33c0ad36f83"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    sourceSets {
        getByName("debug") {
            kotlin.srcDirs("build/generated/ksp/debug/kotlin")
        }
        getByName("release") {
            kotlin.srcDirs("build/generated/ksp/release/kotlin")
        }
    }
}

dependencies {

    implementation("com.google.android.material:material:1.7.0")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("androidx.compose.ui:ui:1.3.2")
    implementation("androidx.compose.ui:ui-tooling:1.3.2")
    implementation("androidx.compose.foundation:foundation:1.3.1")
    implementation("androidx.compose.material:material:1.3.1")
    implementation("com.moriatsushi.launcher:launcher:1.0.0-alpha02")
    implementation("androidx.core:core-ktx:1.9.0")
    ksp("com.moriatsushi.launcher:launcher-processor:1.0.0-alpha02")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.4")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.0")
}
