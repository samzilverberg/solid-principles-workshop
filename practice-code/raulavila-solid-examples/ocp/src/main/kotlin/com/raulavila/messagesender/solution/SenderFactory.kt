package com.raulavila.messagesender.solution

enum class Protocol {
    SMS, EMAIL
}

class SenderFactory {
    private val senderByProtocol = mutableMapOf<Protocol, Sender>()

    fun addSender(protocol: Protocol, sender: Sender) {
        senderByProtocol[protocol] = sender
    }

    fun getSenderForProtocol(protocol: Protocol): Sender? {
        return senderByProtocol[protocol]
    }
}
