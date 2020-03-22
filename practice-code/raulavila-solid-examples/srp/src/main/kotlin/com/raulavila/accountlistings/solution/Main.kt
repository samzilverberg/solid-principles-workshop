package com.raulavila.accountlistings.solution

fun main(args: Array<String>) {
    val accountListings = AccountListings(
            AccountDAO(),
            AccountPrinter()
    )

    accountListings.printAllAccounts()
}