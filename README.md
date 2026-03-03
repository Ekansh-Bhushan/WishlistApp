# <img src="https://github.com/user-attachments/assets/0afa7efc-31bf-433c-9aa3-d3466d5dab46" width="40"/> WishlistApp

A modern Android Wishlist application built using **Kotlin + Jetpack Compose** with clean **MVVM architecture** and local persistence using **Room Database**.

---

## 📱 Overview

<img align="right" src="https://github.com/user-attachments/assets/a04f2109-7ad4-45ad-a0ba-8c68cea379a8" width="280"/>

WishlistApp allows users to manage items they plan to purchase with persistent local storage.

### ✨ Core Features

- Add wishlist items  
- Update existing items  
- Swipe to delete  
- Persistent storage using Room  
- Clean MVVM architecture  
- Asynchronous DB operations with Coroutines

## 📲 Download APK

<img align="right" src="https://github.com/user-attachments/assets/2da645b8-b249-4ae5-a751-f33ca418a33f" width="200"/>

Scan the QR code to download the latest APK directly on your Android device.

Or download manually:

👉 [Download APK](https://drive.google.com/uc?export=download&id=1ZMIFCSMOm1Gq5xaHjZF4EIQ_XUXgwnZq)

<br clear="right"/> 

<br clear="right"/>


## 🔥 Key Screens

<p align="center">
  <img src="https://github.com/user-attachments/assets/8f71cd89-348b-446b-8a8e-72d5775a65b1" width="280"/>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <img src="https://github.com/user-attachments/assets/468eb9de-63b1-4bb0-9e9d-908c7166fe34" width="280"/>
</p>

<p align="center">
  <b>🗑️ Swipe to Delete</b>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <b>✏️ Update Wish Detail</b>
</p>

<p align="center">
  • Uses <code>SwipeToDismiss</code>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  • Pre-filled data
  <br><br>

  • Animated red background
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  • Reusable composable
  <br><br>

  • Delete indicator
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  • Shared ViewModel state
  <br><br>

  • Threshold-based swipe
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  • Snackbar feedback
</p>

## 🛠️ Tech Stack

- Kotlin  
- Jetpack Compose  
- Room Database  
- MVVM Architecture  
- Kotlin Coroutines  
- Android SDK  



## 🧠 What I Learned

### 🔹 MVVM Architecture
- Separation of concerns (UI, Logic, Data)
- Lifecycle-aware ViewModel
- State management in Compose
- Cleaner, scalable structure

### 🔹 Room Database
- Entity, DAO, and Database layers
- CRUD operations
- Integration with ViewModel
- Local persistence abstraction over SQLite

### 🔹 Kotlin Coroutines
- Background execution of database operations
- `suspend` functions
- Avoiding main thread blocking
- Structured concurrency principles

### 🔹 Jetpack Compose
- Declarative UI development
- State-driven recomposition
- Reusable composables
- Modern Android UI patterns

---


## 📂 Project Structure

```bash
├── app/
│   ├── src/
│   │   ├── androidTest/
│   │   │   └── java/
│   │   │       └── eu/
│   │   │           └── ekansh/
│   │   │               └── wishlistapp/
│   │   │                   └── ExampleInstrumentedTest.kt
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── eu/
│   │   │   │       └── ekansh/
│   │   │   │           └── wishlistapp/
│   │   │   │               ├── data/
│   │   │   │               │   ├── Wish.kt
│   │   │   │               │   ├── WishDao.kt
│   │   │   │               │   ├── WishDatabase.kt
│   │   │   │               │   └── WishRespository.kt
│   │   │   │               ├── ui/
│   │   │   │               │   └── theme/
│   │   │   │               │       ├── Color.kt
│   │   │   │               │       ├── Theme.kt
│   │   │   │               │       └── Type.kt
│   │   │   │               ├── AddEditDetailView.kt
│   │   │   │               ├── AppBar.kt
│   │   │   │               ├── Graph.kt
│   │   │   │               ├── HomeView.kt
│   │   │   │               ├── MainActivity.kt
│   │   │   │               ├── Navigation.kt
│   │   │   │               ├── Screen.kt
│   │   │   │               ├── WishListApp.kt
│   │   │   │               └── WishViewModel.kt
│   │   │   ├── res/
│   │   │   │   ├── drawable/
│   │   │   │   │   ├── ic_launcher_background.xml
│   │   │   │   │   └── ic_launcher_foreground.xml
│   │   │   │   ├── mipmap-anydpi-v26/
│   │   │   │   │   ├── ic_launcher_round.xml
│   │   │   │   │   └── ic_launcher.xml
│   │   │   │   ├── mipmap-hdpi/
│   │   │   │   │   ├── ic_launcher_foreground.webp
│   │   │   │   │   ├── ic_launcher_round.webp
│   │   │   │   │   └── ic_launcher.webp
│   │   │   │   ├── mipmap-mdpi/
│   │   │   │   │   ├── ic_launcher_foreground.webp
│   │   │   │   │   ├── ic_launcher_round.webp
│   │   │   │   │   └── ic_launcher.webp
│   │   │   │   ├── mipmap-xhdpi/
│   │   │   │   │   ├── ic_launcher_foreground.webp
│   │   │   │   │   ├── ic_launcher_round.webp
│   │   │   │   │   └── ic_launcher.webp
│   │   │   │   ├── mipmap-xxhdpi/
│   │   │   │   │   ├── ic_launcher_foreground.webp
│   │   │   │   │   ├── ic_launcher_round.webp
│   │   │   │   │   └── ic_launcher.webp
│   │   │   │   ├── mipmap-xxxhdpi/
│   │   │   │   │   ├── ic_launcher_foreground.webp
│   │   │   │   │   ├── ic_launcher_round.webp
│   │   │   │   │   └── ic_launcher.webp
│   │   │   │   ├── values/
│   │   │   │   │   ├── colors.xml
│   │   │   │   │   ├── ic_launcher_background.xml
│   │   │   │   │   ├── strings.xml
│   │   │   │   │   └── themes.xml
│   │   │   │   └── xml/
│   │   │   │       ├── backup_rules.xml
│   │   │   │       └── data_extraction_rules.xml
│   │   │   ├── AndroidManifest.xml
│   │   │   └── ic_launcher-playstore.png
│   │   └── test/
│   │       └── java/
│   │           └── eu/
│   │               └── ekansh/
│   │                   └── wishlistapp/
│   │                       └── ExampleUnitTest.kt
│   ├── .gitignore
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── gradle/
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── README.md
└── settings.gradle.kts
```



## 🚀 How to Run

```bash
git clone https://github.com/Ekansh-Bhushan/WishlistApp.git
Open in Android Studio
```

1. Open in Android Studio
2. Sync Gradle
3. Run on emulator or device

📌 Future Improvements
- Search functionality
- Categories
- Cloud sync
- UI animations
- Dark Mode
