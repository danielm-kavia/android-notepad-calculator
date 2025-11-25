# Android Linting and Static Analysis

Current status:
- This repository currently does not contain an initialized Android project (no `settings.gradle*`, top-level `build.gradle*`, or app module).
- To run Android Lint, the project must have a proper Gradle Android structure.

Steps to enable lint:
1) Initialize Android project structure:
   - Create `settings.gradle.kts` and `build.gradle.kts` at the root of `android-notepad-calculator/`.
   - Create an `app/` module with:
     - `app/build.gradle.kts` applying `com.android.application` and Kotlin plugins
     - `app/src/main/AndroidManifest.xml`
     - `app/src/main/java/...` or `kotlin/...` source files
2) Configure Android Gradle Plugin and SDK versions (e.g., AGP 8.x, compileSdk 34+).
3) Add lint configuration (optional):
   - `app/lint.xml` to customize checks
   - Enable XML/HTML lint reports via `lintOptions { htmlReport = true; xmlReport = true }` (AGP <8) or new DSL in AGP 8+
4) Run lint:
   - `./gradlew :app:lintDebug` (or `./gradlew lint` to run all)
5) Add formatting/static analysis:
   - Kotlin: ktlint or Spotless + Detekt
   - Java: Spotless with google-java-format
6) CI integration:
   - Add a CI job to run `./gradlew lint` and fail the build on errors.

Without these, Android Lint cannot run because there is no source set to analyze.
