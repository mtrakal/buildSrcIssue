package cz.bs

import org.gradle.api.JavaVersion

// https://github.com/gradle/kotlin-dsl/issues/1088
// https://expertise.jetruby.com/how-to-write-gradle-scripts-with-kotlin-dsl-better-than-groovy-a63ffc9be2e3

object Config {

    object Android {
        const val applicationId = "cz.mtrakal.buildsrc"
        const val appVersionCode = 1
        const val appVersionName = "1.0"

        // sdk and tools
        const val compileSdkVersion = 28
        const val buildToolsVersion = "28.0.2" // https://developer.android.com/studio/releases/build-tools.html
        const val minSdkVersion = 16
        const val targetSdkVersion = 26 // https://developer.android.com/distribute/best-practices/develop/target-sdk
    }

    object Versions {
        const val kotlinVersion = "1.2.70"
        const val gradleBuildTools = "3.3.0-alpha10"

        val sourceCompatibility = JavaVersion.VERSION_1_8
        val targetCompatibility = JavaVersion.VERSION_1_8

        // sdk and tools
        const val compileSdkVersion = 28
        const val buildToolsVersion = "28.0.2" // https://developer.android.com/studio/releases/build-tools.html
        const val minSdkVersion = 16
        const val targetSdkVersion = 26 // https://developer.android.com/distribute/best-practices/develop/target-sdk

        // google dependencies versions
        const val supportLibraryVersion = "28.0.0-rc02" // https://developer.android.com/topic/libraries/support-library/revisions.html
    }

    object BuildPlugins {
        const val androidPlugin = "com.android.tools.build:gradle:${Versions.gradleBuildTools}"
        const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    }

    object Libs {
        const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinVersion}"
    }
}