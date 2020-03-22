package com.raulavila.publishing

open class Publisher {

    open fun publish(message: String) {
        println("Publisher publishes message: $message")
    }
}


class ObservablePublisher(val observers: List<Observer>): Publisher() {

    override fun publish(message: String) {
        observers.forEach { it.send(message) }
    }
}

class NoOpPublisher : Publisher() {
    override fun publish(message: String) {}
}