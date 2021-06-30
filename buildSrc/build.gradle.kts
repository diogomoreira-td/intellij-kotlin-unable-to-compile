plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

object Versions {
    // https://plugins.gradle.org/plugin/org.jetbrains.kotlin.jvm
    const val kotlinVersion = "1.4.32"
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}")
    implementation("org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlinVersion}")
}
