package com.raulavila.messagesender.solution

interface Sender {
    fun send(message: String)
}


class SmsSender: Sender {
    override fun send(message: String) {
        println("Sending message via SMS: $message")
    }
}

class EmailSender: Sender {
    override fun send(message: String) {
        println("Sending message via e-mail: $message")
    }
}