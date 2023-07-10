buildscript {

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20")
    }
}

allprojects {
    group = "com.progressterra.ipbandroidapi"
    version = "0.5.32"
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
