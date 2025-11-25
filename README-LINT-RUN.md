To run Android lint after project skeleton initialization:

1) Ensure Java 17+ is available.
2) From the android-notepad-calculator folder:
   - ./gradlew :app:lintDebug
   - or: ./gradlew lint

Reports are generated under app/build/reports/lint/.
If build errors occur due to missing Android SDK packages in CI, configure the Android SDK and licenses or use a preconfigured Android build image.
