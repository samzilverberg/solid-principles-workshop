package com.raulavila.factory.solution

class Manager(val workers: List<Workable>) {

    fun manage() {
        workers.forEach { it.work() }
    }
}