import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    `maven-publish`
    application
}

publishing {
    repositories {
        mavenLocal()
        maven {
            url = uri("https://jitpack.io")
            version = project.version
        }
    }
}

allprojects {
    group = "me.tensess.api"
    project.version = "1.0.0"

    repositories {
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}