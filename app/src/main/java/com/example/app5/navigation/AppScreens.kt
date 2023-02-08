package com.example.app5.navigation

sealed class AppScreens ( val route: String ){

    object FirstScreen : AppScreens(route = "firstScreen")
    object SecondScreen : AppScreens(route = "secondScreen")
    object ThirdScreen : AppScreens(route = "thirdScreen")
}