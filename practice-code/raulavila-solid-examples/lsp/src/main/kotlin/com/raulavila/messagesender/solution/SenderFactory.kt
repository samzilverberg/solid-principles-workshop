package com.raulavila.messagesender.solution

interface SenderFactory {
    fun getSenderForProtocol(protocol: Protocol): Sender?
}

class SenderFactoryImpl(val senderByProtocol: Map<Protocol, Sender>): SenderFactory {
    override fun getSenderForProtocol(protocol: Protocol): Sender? {
        return senderByProtocol[protocol]
    }
}

enum class Protocol {
    SMS, EMAIL
}
