package com.raulavila.accountlistings

class AccountListings {
    fun printAllAccounts() {
        val accounts = fetchAllAccounts()

        accounts.forEach { printAccount(it) }
    }

    fun fetchAllAccounts(): List<Account> {
        val accounts = listOf(
                Account(1, "Jon"),
                Account(2, "Bharat"),
                Account(3, "Simon")
        )

        return accounts
    }

    fun printAccount(account: Account) {
        println("ID: ${account.id} NAME: ${account.name}")
    }
}