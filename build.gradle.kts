/**
 * Root Gradle build configuration for the android-notepad-calculator project.
 * Uses Android Gradle Plugin 8.7.2 and Kotlin 1.9.24.
 */
plugins {
    id("com.android.application") version "8.7.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
}

// PUBLIC_INTERFACE
tasks.register("clean") {
    group = "build"
    description = "Cleans the build directories."
    // No-op; module-level clean tasks will run as needed.
}
