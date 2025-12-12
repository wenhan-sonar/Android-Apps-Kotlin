plugins {
    id("com.android.application") version "8.1.0"
    id("kotlin-android") version "1.8.0" // Ensure Kotlin is also reasonably new
    id("org.sonarqube") version "6.3.1.5724"
}

repositories {
    google()
    mavenCentral()
}

android {
    // ADD THIS LINE (use your app's package name, e.g., "com.example.myapp")
    namespace = "com.wenhan.android.apps" 
    
    compileSdk = 34 // Recommended to update this as well
    compileSdkVersion(30)
    defaultConfig {
        applicationId = "org.gradle.samples"
        minSdkVersion(16)
        targetSdkVersion(30)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("com.google.android.material:material:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    testImplementation("junit:junit:4.13.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.2")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}

sonar {
  properties {
    property("sonar.projectKey", "wenhan-sonar_Android-Apps-Kotlin_f045df2e-f030-4826-a80d-47d1aaabefbe")
    property("sonar.projectName", "Android-Apps-Kotlin")
  }
}