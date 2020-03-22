package com.raulavila.factory.solution

fun main(args: Array<String>) {

    val manager = Manager(listOf(
            Person(),
            Robot()
    ))

    manager.manage()
}