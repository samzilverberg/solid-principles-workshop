package com.raulavila.insurance.solution

interface Claim {
    fun isCompleted(): Boolean
    fun pay()
}

class DentalClaim: Claim {
    override fun isCompleted(): Boolean {
        println("Validating completeness of dental claim")
        return true
    }

    override fun pay() {
        println("Paying dental claim")
    }
}

class HealthClaim: Claim {
    override fun isCompleted(): Boolean {
        println("Validating completeness of health claim")
        return true
    }

    override fun pay() {
        println("Paying health claim")
    }
}

class HouseClaim: Claim {
    override fun isCompleted(): Boolean {
        println("Validating completeness of house claim")
        return true
    }

    override fun pay() {
        println("Paying house claim")
    }
}