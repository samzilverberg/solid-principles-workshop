package com.raulavila.insurance

fun main(args: Array<String>) {
    val insuranceManager = InsuranceManager()
    insuranceManager.payDentalClaim(DentalClaim())
    insuranceManager.payHealthClaim(HealthClaim())
}