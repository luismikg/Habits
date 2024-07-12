package com.luis.habitsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.luis.habitsapp.navigation.NavigationHost
import com.luis.habitsapp.navigation.NavigationRoute
import com.luis.habitsapp.ui.theme.HabitsAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            HabitsAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavigationHost(
                        navHostController = navController,
                        startDestination = getStartDestination()
                    )
                }
            }
        }
    }

    private fun getStartDestination(): NavigationRoute {
        return if (viewModel.hasSeenOnboard) {
            NavigationRoute.Login
        } else {
            NavigationRoute.Onboarding
        }
    }
}
