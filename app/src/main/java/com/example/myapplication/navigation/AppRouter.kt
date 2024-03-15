package com.example.myapplication.navigation


import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen {
    object SignUpScreen : Screen()
    object LogInScreen: Screen()
    object HomeScreen:Screen()
    object ShowHomeScreen:Screen()
    object UploadScreen:Screen()
    object Welcome:Screen()
    object Profile:Screen()
}

object AppRouter {
    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)
    fun navigateTo(destination: Screen) {
        currentScreen.value = destination
    }
}
