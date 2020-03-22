package com.raulavila.factory.solution

interface Workable {
    fun work()
}

interface Feedable {
    fun eat()
}

class Person: Workable, Feedable {
    override fun work() {
        println("Person is working")
    }

    override fun eat() {
        println("Person is eating")
    }
}

class Robot: Workable {
    override fun work() {
        println("Robot is working")
    }
}
