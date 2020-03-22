package com.raulavila.publishing.solution

class Observer(val observerName: String) {

    fun send(message: String) {
        println("$observerName received message: $message")
    }
}