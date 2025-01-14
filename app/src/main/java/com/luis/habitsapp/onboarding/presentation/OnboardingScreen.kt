package com.luis.habitsapp.onboarding.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.hilt.navigation.compose.hiltViewModel
import com.luis.habitsapp.R
import com.luis.habitsapp.onboarding.presentation.components.OnboardingPager

@Composable
fun OnboardingScreen(
    viewModel: OnboardingViewModel = hiltViewModel(),
    onFinish: () -> Unit
) {

    LaunchedEffect(key1 = viewModel.hasSeenOnboarding) {
        if (viewModel.hasSeenOnboarding) {
            onFinish()
        }
    }
    val pages = listOf(
        OnboardingPagerInformation(
            title = "Welcome to Monumental Habits",
            subTitle = "We can help you to be a better version of yourself.",
            image = R.drawable.onboarding1
        ),
        OnboardingPagerInformation(
            title = "Create new habits",
            subTitle = "We can help you to be a better version of yourself.",
            image = R.drawable.onboarding2
        ),
        OnboardingPagerInformation(
            title = "Keep track of your progress",
            subTitle = "We can help you to be a better version of yourself.",
            image = R.drawable.onboarding3
        ),
        OnboardingPagerInformation(
            title = "Join a supportive community",
            subTitle = "We can help you to be a better version of yourself.",
            image = R.drawable.onboarding4
        ),
    )

    OnboardingPager(pages = pages, onFinish = { viewModel.completeOnboarding() })
}