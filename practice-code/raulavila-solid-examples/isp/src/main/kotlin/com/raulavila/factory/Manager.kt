package com.raulavila.factory

class Manager(val workers: List<Worker>) {

    fun manage() {
        workers.forEach { it.work() }
    }
}