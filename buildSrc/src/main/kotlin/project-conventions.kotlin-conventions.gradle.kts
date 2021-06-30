import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

// Plugin to be used by Kotlin projects
plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
