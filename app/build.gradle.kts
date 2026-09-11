plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
    id("com.google.gms.google-services")
    id("com.google.dagger.hilt.android")
    id("com.google.firebase.crashlytics")
}

android {

    namespace = "com.example.skillforgeai"

    compileSdk = 37

    defaultConfig {

        applicationId = "com.example.skillforgeai"

        minSdk = 24
        targetSdk = 37

        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner =
            "androidx.test.runner.AndroidJUnitRunner"

        buildConfigField(
            "String",
            "GEMINI_API_KEY",
            "\"YOUR_GEMINI_API_KEY\""
        )
    }

    buildFeatures {
        viewBinding = true
        buildConfig = true
    }

    buildTypes {

        release {

            isMinifyEnabled = false

            proguardFiles(
                getDefaultProguardFile(
                    "proguard-android-optimize.txt"
                ),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {

        sourceCompatibility =
            JavaVersion.VERSION_11

        targetCompatibility =
            JavaVersion.VERSION_11
    }

    kotlinOptions {

        jvmTarget = "11"
    }
}

dependencies {

    // Core Android

    implementation("androidx.core:core-ktx:1.17.0")
    implementation("androidx.appcompat:appcompat:1.7.1")

    implementation("com.google.android.material:material:1.12.0")

    implementation("androidx.constraintlayout:constraintlayout:2.2.1")

    implementation("androidx.activity:activity-ktx:1.10.1")

    implementation("androidx.recyclerview:recyclerview:1.4.0")

    // Lifecycle

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.9.3")

    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.9.3")

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.9.3")

    // Navigation

    implementation(
        "androidx.navigation:navigation-fragment-ktx:2.9.3"
    )

    implementation(
        "androidx.navigation:navigation-ui-ktx:2.9.3"
    )

    // Coroutines

    implementation(
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.1"
    )

    implementation(
        "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.8.1"
    )

    // Firebase BOM

    implementation(
        platform("com.google.firebase:firebase-bom:34.3.0"
        )
    )

    // Firebase

    implementation(
        "com.google.firebase:firebase-auth"
    )

    implementation(
        "com.google.firebase:firebase-database"
    )

    implementation(
        "com.google.firebase:firebase-storage"
    )

    implementation(
        "com.google.firebase:firebase-messaging"
    )

    implementation(
        "com.google.firebase:firebase-analytics"
    )

    implementation(
        "com.google.firebase:firebase-crashlytics"
    )

    // Gemini AI

    implementation(
        "com.google.ai.client.generativeai:generativeai:0.9.0"
    )

    // Glide

    implementation(
        "com.github.bumptech.glide:glide:4.16.0"
    )

    kapt(
        "com.github.bumptech.glide:compiler:4.16.0"
    )

    // Gson

    implementation(
        "com.google.code.gson:gson:2.13.1"
    )

    // WorkManager

    implementation(
        "androidx.work:work-runtime-ktx:2.10.3"
    )

    // Hilt (Optional)

    implementation(
        "com.google.dagger:hilt-android:2.57.1"
    )

    kapt(
        "com.google.dagger:hilt-compiler:2.57.1"
    )

    // Testing

    testImplementation(
        "junit:junit:4.13.2"
    )

    androidTestImplementation(
        "androidx.test.ext:junit:1.3.0"
    )

    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")
    implementation("com.google.dagger:hilt-android:2.57")
    kapt("com.google.dagger:hilt-compiler:2.57")
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
    implementation("com.google.android.gms:play-services-auth:21.2.0")
}