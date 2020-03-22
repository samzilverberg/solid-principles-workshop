package com.raulavila.messagesender

interface SenderFactory {
    fun getSenderForProtocol(protocol: Protocol): Sender?
}

class SenderFactoryImpl(val senderByProtocol: Map<Protocol, Sender>): SenderFactory {
    override fun getSenderForProtocol(protocol: Protocol): Sender? {
        if (!senderByProtocol.contains(protocol)) {
            throw Exception("Protocol not supported")
        }

        return senderByProtocol[protocol]
    }
}

enum class Protocol {
    SMS, EMAIL
}
