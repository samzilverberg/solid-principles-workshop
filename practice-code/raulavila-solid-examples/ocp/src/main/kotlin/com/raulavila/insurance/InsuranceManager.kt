package com.raulavila.insurance

class InsuranceManager {
    fun payHealthClaim(healthClaim: HealthClaim) {
        if (healthClaim.isCompleted()) {
            healthClaim.pay()
        }
    }

    fun payDentalClaim(dentalClaim: DentalClaim) {
        if (dentalClaim.isCompleted()) {
            dentalClaim.pay()
        }
    }
}