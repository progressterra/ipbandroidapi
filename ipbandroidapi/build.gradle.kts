plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-parcelize")
    id("maven-publish")
    id("org.jetbrains.kotlin.android")
}

android {

    compileSdk = 34

    defaultConfig {
        minSdk = 21

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    publishing {
        singleVariant("release")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"))
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    namespace = "com.progressterra.ipbandroidapi"
}

afterEvaluate {
    publishing {
        repositories {
            maven {
                name = "GitHubPackages"
                url = uri("https://maven.pkg.github.com/progressterra/ipbandroidapi")
                credentials {
                    username = project.findProperty("gpr.user") as String?
                    password = project.findProperty("gpr.key") as String?
                }
            }
        }
        publications {
            register<MavenPublication>("release") {
                from(components["release"])
                artifactId = "ipbandroidapi"
            }
        }
    }
}

dependencies {
    api("com.squareup.retrofit2:retrofit:2.9.0")
    api("com.squareup.retrofit2:converter-gson:2.9.0")
    api("com.squareup.okhttp3:logging-interceptor:4.12.0")
    api("com.google.code.gson:gson:2.10.1")
    api("io.insert-koin:koin-android:3.5.0")
}
