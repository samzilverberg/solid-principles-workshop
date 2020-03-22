package com.raulavila.messagesender

fun main(args: Array<String>) {
    val senderFactory = SenderFactory()

    val smsSender = senderFactory.getSenderForProtocol(Protocol.SMS)
    smsSender!!.send("Hello World!")

    val emailSender = senderFactory.getSenderForProtocol(Protocol.EMAIL)
    emailSender!!.send("Goodbye!")
}