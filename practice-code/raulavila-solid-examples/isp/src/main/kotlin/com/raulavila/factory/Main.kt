package com.raulavila.factory

fun main(args: Array<String>) {

    val manager = Manager(listOf(
            Person(),
            Robot()
    ))

    manager.manage()
}