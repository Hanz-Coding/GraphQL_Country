# Country App - Android Kotlin

Country App is an Android application written in Kotlin, utilizing **GraphQL**, **Dagger Hilt** for dependency injection, and **Jetpack Compose** for UI development.

## 🚀 Technologies Used
- **Kotlin** - Main programming language
- **GraphQL** - API for fetching data from the server
- **Apollo GraphQL** - GraphQL Client Library
- **Dagger Hilt** - Dependency Injection
- **Jetpack Compose** - Modern declarative UI framework
- **Coroutines & Flow** - Asynchronous programming
- **MVVM Architecture** - Modern architecture pattern

## 📦 Installation

### 1. Clone the repository
```sh
git clone [https://github.com/your-username/country-app.git](https://github.com/Hanz-Coding/GraphQL_Country.git)
cd country-app
```

### 2. Configure GraphQL Schema
```sh
./gradlew :app:downloadApolloSchema \
  --endpoint "https://countries.trevorblades.com/graphql" \
  --schema "app/src/main/graphql/com/example/country/schema.graphqls"
```

### 3. Run the application
Open the project in **Android Studio** and run it on an emulator or physical device.

## 🏗️ Architecture
The application follows the **MVVM** (Model-View-ViewModel) pattern for efficient data and UI management.

```
com.example.country
│── di            # Dependency Injection with Hilt
│── network       # Apollo GraphQL Client
│── repository    # Acts as an intermediary between API and ViewModel
│── ui            # Screens built with Jetpack Compose
│── viewmodel     # ViewModel handling UI logic
└── model         # Data classes defining app models
```

## 🛠️ Key Dependencies
```kotlin
dependencies {
    // Jetpack Compose
    implementation("androidx.compose.ui:ui:1.5.0")
    implementation("androidx.compose.material3:material3:1.2.0")

    // GraphQL Apollo
    implementation("com.apollographql.apollo3:apollo-runtime:3.8.2")

    // Dagger Hilt
    implementation("com.google.dagger:hilt-android:2.50")
    kapt("com.google.dagger:hilt-compiler:2.50")
}
```

## 📷 Screenshots
*(Add screenshots here if available)*

## 🔥 Features
✅ Display a list of countries 
✅ Search for a country by name or ISO code
✅ View detailed country information
✅ Supports **Dark Mode**


---
🔥 *For contributions or bug reports, please create a Pull Request or Issue on GitHub!* 🚀

