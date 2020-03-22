package com.raulavila.factory

interface Worker {
    fun work()
    fun eat()
}

class Person: Worker {
    override fun work() {
        println("Person is working")
    }

    override fun eat() {
        println("Person is eating")
    }
}

class Robot: Worker {
    override fun work() {
        println("Robot is working")
    }

    override fun eat() {
        //???????????
    }
}
