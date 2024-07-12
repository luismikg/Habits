package com.luis.habitsapp.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.luis.habitsapp.onboarding.presentation.OnboardingScreen
import com.luis.habitsapp.onboarding.presentation.OnboardingViewModel

@Composable
fun NavigationHost(
    navHostController: NavHostController,
    startDestination: NavigationRoute
) {
    NavHost(navController = navHostController, startDestination = startDestination.route) {
        composable(route = NavigationRoute.Onboarding.route) {
            //OnBoarding
            Column(modifier = Modifier.fillMaxSize()) {
                OnboardingScreen(
                    onFinish = {
                        navHostController.popBackStack()
                        navHostController.navigate(NavigationRoute.Login.route) }
                )
            }
        }

        composable(route = NavigationRoute.Login.route) {
            BackHandler(true) {
                println()
            }

            Column {
                Text(text = "Login screen")
            }
        }
    }
}