package com.raulavila.accountlistings.solution

class AccountListings(
        val accountDAO: AccountDAO,
        val accountPrinter: AccountPrinter) {

    fun printAllAccounts() {
        val accounts = accountDAO.fetchAllAccounts()
        accountPrinter.printAllAccounts(accounts)
    }
}

class AccountDAO {
    fun fetchAllAccounts(): List<Account> {
        val accounts = listOf(
                Account(1, "Jon"),
                Account(2, "Bharat"),
                Account(3, "Simon")
        )

        return accounts
    }
}

class AccountPrinter {
    fun printAllAccounts(accounts: List<Account>) {
        accounts.forEach { printAccount(it) }
    }

    fun printAccount(account: Account) {
        println("ID: ${account.id} NAME: ${account.name}")
    }
}