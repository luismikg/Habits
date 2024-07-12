package com.luis.habitsapp.onboarding.presentation

import androidx.annotation.DrawableRes

data class OnboardingPagerInformation(
    val title: String,
    val subTitle: String,
    @DrawableRes val image: Int
)
