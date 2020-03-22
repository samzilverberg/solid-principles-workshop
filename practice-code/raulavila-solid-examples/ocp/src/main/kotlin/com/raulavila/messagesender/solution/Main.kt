package com.raulavila.messagesender.solution

fun main(args: Array<String>) {
    val senderFactory = SenderFactory()

    senderFactory.addSender(Protocol.SMS, SmsSender())
    senderFactory.addSender(Protocol.EMAIL, EmailSender())

    val smsSender = senderFactory.getSenderForProtocol(Protocol.SMS)
    smsSender!!.send("Hello World!")

    val emailSender = senderFactory.getSenderForProtocol(Protocol.EMAIL)
    emailSender!!.send("Goodbye!")
}