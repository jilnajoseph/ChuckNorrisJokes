🥊 Chuck Norris Jokes App

A simple Android application that displays random Chuck Norris jokes. This project was built to practice modern Android development techniques using Kotlin and Jetpack Compose.

📱 Features

Random Jokes: Fetch a new random Chuck Norris joke with the click of a button.
Modern UI: Built entirely with Jetpack Compose.
Image Loading: Displays the Chuck Norris icon using the Coil library.
State Management: Handles Loading, Success, and Error states gracefully.
Offline Ready Architecture: Uses ViewModel to survive screen rotations.

🛠 Tech Stack & Libraries

This project utilizes the following technologies:

Kotlin: Official programming language for Android development.
Jetpack Compose: Modern toolkit for building native UI.
Retrofit: Type-safe HTTP client for Android to handle API calls.
Gson: A Java/Kotlin library to convert Java Objects into JSON and back.
Coroutines: For managing background threads (asynchronous programming).
StateFlow: A state-holder observable flow that emits updates to the UI.
ViewModel: Stores UI-related data that isn't destroyed when the app rotates.
Coil: An image loading library for Android backed by Kotlin coroutines.

🏗 Architecture

This app follows the MVVM (Model-View-ViewModel) architecture pattern:

Model: The Data Class (Joke.kt) and Retrofit Service (JokeApi.kt).
ViewModel: (JokeViewModel.kt) Handles the business logic, makes API calls, and updates the state.
View: (JokeScreen.kt) Observes the state from the ViewModel and renders the UI using Compose.

🔌 API Reference

This app uses the Chuck Norris IO API.

Endpoint: https://api.chucknorris.io/jokes/random
Method: GET

<img width="600" height="1080" alt="Screenshot_20260422_184904" src="https://github.com/user-attachments/assets/d08ebd72-1732-4ac2-b7b3-dae9d090d2d4" />

<img width="600" height="1080" alt="Screenshot_20260422_184832" src="https://github.com/user-attachments/assets/4e781304-8b79-409b-8f89-453352e9b27b" />
