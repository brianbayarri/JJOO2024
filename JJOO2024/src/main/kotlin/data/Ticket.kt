package data

data class Ticket(
    val id: Long,
    val seat: String,
    val date: String,
    val hour: String,
    val place: String,
    val price: Double,
    val sport: Sport
)
