package com.luis.habitsapp.onboarding.domain.usecase

import com.luis.habitsapp.onboarding.domain.repository.OnboardingRepository

class HasSeenOnboardingUseCase(private val onboardingRepository: OnboardingRepository) {

    operator fun invoke(): Boolean {
        return onboardingRepository.hasSeenOnboarding()
    }
}