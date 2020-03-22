package com.raulavila.reservations.solution

fun main(args: Array<String>) {

    val reservationRepository = ReservationMongoDbRepository()
//    val reservationRepository = ReservationOracleRepository()

    val reservationManager = ReservationManager(reservationRepository)
    reservationManager.reserveRoom(1, "Raul")

}