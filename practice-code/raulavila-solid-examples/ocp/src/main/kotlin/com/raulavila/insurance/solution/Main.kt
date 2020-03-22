package com.raulavila.insurance.solution

fun main(args: Array<String>) {
    val insuranceManager = InsuranceManager()
    insuranceManager.payClaim(DentalClaim())
    insuranceManager.payClaim(HealthClaim())
    insuranceManager.payClaim(HouseClaim())
}