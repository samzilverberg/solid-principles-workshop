package com.raulavila.reservations.solution

data class Reservation(val roomId: Int, val name: String)

interface ReservationRepository {
    fun save(reservation: Reservation)
}

class ReservationMongoDbRepository: ReservationRepository {
    override fun save(reservation: Reservation) {
        println("Persisting reservation in MongoDB")
    }
}

class ReservationOracleRepository: ReservationRepository {
    override fun save(reservation: Reservation) {
        println("Persisting reservation in Oracle")
    }
}

class ReservationManager(val reservationRepository: ReservationRepository ) {
    fun reserveRoom(roomId: Int, name: String) {
        reservationRepository.save(Reservation(roomId, name))
    }
}
