# Navwei Android V2 - Kotlin

***This is an Android Clean Architecture  project***
Android Application under MVVM, UseCases and Repositories architecture using:
Android Architecture Components: ViewModel and LiveData
Rx2
Dagger 2 for Android

## Benefit

* Makes your new project clean
* Seperate UI, business logic and data sources' responsibilities
* Testable
* Avoids multi-threading problems

## Approach of Clean Architecture for Android
There are 4 layers in the project: Data, Domain, Entity and Presentation(app), and the UI layer contains view and viewModels.


## Multi-threading
Base `UseCase` class handles the thread of Rx chains, it puts  whole chain on IO thread, and then changes back to Android main thread(UI thread) for the steps after use case execution. That means when you write on this project, then you don't have to worry about any multi-threading issue.

## Requirements &amp; configurations
#### Requirements
- JDK 8
- Android SDK API 29
- Kotlin Gradle plugin 1.3.50 *(it will be installed automatically when this project is synced)*

#### Configurations
- minSdkVersion=21
- targetSdkVersion=29

## Language
*   [Kotlin](https://kotlinlang.org/)

## Libraries
*   [AndroidX](https://developer.android.com/jetpack/androidx)
*   [Dagger 2](https://google.github.io/dagger/)
*   [RxJava2](https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0)
*   [RxAndroid](https://github.com/ReactiveX/RxAndroid)
*   [OkHttp](http://square.github.io/okhttp/)
*   [Retrofit](http://square.github.io/retrofit/)
*   [Gson](https://github.com/google/gson)
*   [JUnit 4](https://junit.org/junit4/)


## More about The Clean Architecture

[The Clean Architecture](https://8thlight.com/blog/uncle-bob/2012/08/13/the-clean-architecture.html)

# navwei-android-v2