package com.raulavila.insurance

class DentalClaim {
    fun isCompleted(): Boolean {
        println("Validating completeness of dental claim")
        return true
    }

    fun pay() {
        println("Paying dental claim")
    }
}

class HealthClaim {
    fun isCompleted(): Boolean {
        println("Validating completeness of health claim")
        return true
    }

    fun pay() {
        println("Paying health claim")
    }
}