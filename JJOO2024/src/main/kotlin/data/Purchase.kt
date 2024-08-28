package data

data class Purchase(
    val id: Long,
    val userId: Long,
    val ticketId: Long,
    val amount: Double,
    val createdDate: String,
)