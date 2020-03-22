package com.raulavila.publishing.solution

fun main(args: Array<String>) {
    val publisher = ObservablePublisher(
            listOf(
                Observer("observer1"),
                Observer("observer2")
            )
    )

    publisher.publish("Hello")
}