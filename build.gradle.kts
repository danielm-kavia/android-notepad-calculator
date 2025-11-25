plugins {
    id("com.android.application") version "8.7.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
}

task<org.gradle.api.DefaultTask>("clean") {
    group = "build"
    description = "Cleans the build directory."
}
