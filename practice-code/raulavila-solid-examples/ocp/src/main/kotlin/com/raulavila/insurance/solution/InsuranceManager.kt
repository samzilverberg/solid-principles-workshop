package com.raulavila.insurance.solution

class InsuranceManager {
    fun payClaim(claim: Claim) {
        if (claim.isCompleted()) {
            claim.pay()
        }
    }
}