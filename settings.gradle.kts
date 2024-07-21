pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        id("io.quarkus.extension") version "3.12.3"
    }
}

include("my-ext")
project(":my-ext").projectDir = File("runtime")

include("my-ext-deployment")
project(":my-ext-deployment").projectDir = File("deployment")
