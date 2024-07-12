package com.luis.habitsapp.onboarding.domain.repository

interface OnboardingRepository {

    fun hasSeenOnboarding(): Boolean
    fun completeOnboarding()
}