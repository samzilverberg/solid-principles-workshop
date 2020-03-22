package com.raulavila.messagesender

enum class Protocol {
    SMS, EMAIL
}

class SenderFactory {
    fun getSenderForProtocol(protocol: Protocol): Sender? {
        return when (protocol) {
            Protocol.SMS -> SmsSender()
            Protocol.EMAIL -> EmailSender()
            else -> null
        }
    }
}