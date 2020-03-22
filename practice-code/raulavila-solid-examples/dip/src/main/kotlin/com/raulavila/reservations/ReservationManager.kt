package com.raulavila.reservations

data class Reservation(val roomId: Int, val name: String)

class ReservationMongoDbRepository {
    fun save(reservation: Reservation) {
        println("Persisting reservation in MongoDB")
    }
}

class ReservationManager {
    val reservationRepository = ReservationMongoDbRepository()

    fun reserveRoom(roomId: Int, name: String) {
        reservationRepository.save(Reservation(roomId, name))
    }
}
