package com.luis.habitsapp.navigation

sealed class NavigationRoute(val route: String) {
    data object Onboarding : NavigationRoute("onboarding")
    data object Login : NavigationRoute("login")

}