package com.luis.habitsapp.onboarding.domain.usecase

import com.luis.habitsapp.onboarding.domain.repository.OnboardingRepository

class CompleteOnboardingUseCase(private val onboardingRepository: OnboardingRepository) {

    operator fun invoke() {
        onboardingRepository.completeOnboarding()
    }
}