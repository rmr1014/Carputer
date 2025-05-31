# Carputer

Carputer is an Android application project designed to run on Android devices, providing a custom interface and features suitable for in-car use. This project is structured as a standard Android Studio/Gradle project.

## Features
- Main activity with a simple UI including toggle and submit buttons
- Uses Android's AppCompat and ConstraintLayout for modern UI
- Example unit and instrumented tests included

## Project Structure
- `app/` - Main Android application module
  - `src/main/java/` - Java source code
  - `src/main/res/` - Application resources (layouts, drawables, values, etc.)
  - `src/androidTest/` - Instrumented tests (run on device/emulator)
  - `src/test/` - Local unit tests (run on JVM)
- Gradle build scripts and wrapper for easy building

## Requirements
- Android Studio 3.0+ (or compatible IDE)
- Android SDK 26 (minimum SDK 23)
- Java JDK 8+

## Build & Run
1. Clone this repository.
2. Open the project in Android Studio.
3. Let Gradle sync and download dependencies.
4. Connect an Android device or start an emulator.
5. Click **Run** to build and deploy the app.

Alternatively, you can build from the command line:

```powershell
# On Windows (PowerShell)
./gradlew assembleDebug
```

The APK will be generated in `app/build/outputs/apk/debug/`.

## Testing
- Unit tests: Run with `./gradlew test`
- Instrumented tests: Run with `./gradlew connectedAndroidTest`

## License
This project is provided as-is for educational and personal use. See individual file headers or contact the author for more information.
