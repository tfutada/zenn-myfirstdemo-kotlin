pluginManagement {
    // Declare the repositories where plugins are stored.
    repositories {
        gradlePluginPortal()
        mavenCentral()
        mavenLocal()
    }

    //  The plugin dependencies with versions of the plugins congruent with the specified CorDapp plugin version,
    //  Corda API version, and Kotlin version.
    plugins {
        id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
    }
}

rootProject.name = "firstdemo"

