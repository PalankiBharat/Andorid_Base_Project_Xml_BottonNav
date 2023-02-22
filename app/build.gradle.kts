import org.apache.tools.ant.util.JavaEnvUtils.VERSION_11

plugins {
    id ("com.android.application")
    kotlin("android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
    id ("androidx.navigation.safeargs.kotlin")
    id ("kotlin-parcelize")
}

android {
    namespace = "com.example.andoridbaseprojectwithxmlandbottonnav"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.andoridbaseprojectwithxmlandbottonnav"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
        multiDexEnabled = true
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures{
        viewBinding = true
        dataBinding = true
    }
    kotlin {
        jvmToolchain {
            languageVersion.set(JavaLanguageVersion.of("11"))
        }
    }
}

dependencies {

    // todo - Note Update the dependencies and default configs like minSdk or targetSdk according to latest projects

    implementation ("androidx.core:core-ktx:1.9.0")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("com.google.android.material:material:1.8.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.security:security-crypto-ktx:1.1.0-alpha04")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.3")

    // Navigation
    implementation ("androidx.navigation:navigation-fragment-ktx:2.5.3")
    implementation ("androidx.navigation:navigation-ui-ktx:2.5.3")
    implementation ("androidx.navigation:navigation-dynamic-features-fragment:2.5.3")

    // Architectural Components
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")

    // Lifecycle
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4")

    // Coroutine Lifecycle Scopes
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.5.1")

    // Activity KTX for viewModels()
    implementation ("androidx.activity:activity-ktx:1.6.1")

    //Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.45")
    kapt ("com.google.dagger:hilt-android-compiler:2.45")
    kapt ("androidx.hilt:hilt-compiler:1.0.0")

    //DataStore
    implementation ("androidx.datastore:datastore-preferences:1.0.0")

    //Room Database
    val room_version = "2.5.0"
    implementation ("androidx.room:room-runtime:$room_version")
    annotationProcessor ("androidx.room:room-compiler:$room_version")
    kapt ("androidx.room:room-compiler:$room_version")
    implementation ("androidx.room:room-ktx:$room_version")

    // Easy Permission for permission handling - (OPTIONAL)
    implementation ("pub.devrel:easypermissions:3.0.0")

}