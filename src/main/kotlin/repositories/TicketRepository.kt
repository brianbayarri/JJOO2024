package repositories

import data.Ticket

object TicketRepository {

    private val tickets = mutableListOf<Ticket>()

    init {
        tickets.add(
            Ticket(
                1L,
                "14A",
                "2024/07/02",
                "10:30",
                "PSG Stadium",
                150000.00,
                SportRepository.getFootball()
            )
        )

        tickets.add(
            Ticket(
                2L,
                "22B",
                "2024-07-12",
                "15:00",
                "Olympic Arena",
                200500.75,
                SportRepository.getBasketball()
            )
        )

        tickets.add(
            Ticket(
                3L,
                "10C",
                "2024-07-25",
                "18:45",
                "National Stadium",
                119000.99,
                SportRepository.getAthletics()
            )
        )

        tickets.add(
            Ticket(
                4L,
                "5D",
                "2024-07-30",
                "12:00",
                "Main Arena",
                180999.20,
                SportRepository.getSwimming()
            )
        )

        tickets.add(
            Ticket(
                5L,
                "8E",
                "2024-08-01",
                "20:30",
                "City Sports Complex",
                161500.45,
                SportRepository.getGymnastics()
            )
        )

        tickets.add(
            Ticket(
                6L,
                "13F",
                "2024-08-07",
                "17:00",
                "Regional Stadium",
                140250.10,
                SportRepository.getCycling()
            )
        )

        tickets.add(
            Ticket(
                7L,
                "3G",
                "2024-08-10",
                "14:00",
                "Victory Stadium",
                130125.35,
                SportRepository.getRowing()
            )
        )

        tickets.add(
            Ticket(
                8L,
                "6H",
                "2024-08-15",
                "16:30",
                "Championship Arena",
                190750.85,
                SportRepository.getFencing()
            )
        )

        tickets.add(
            Ticket(
                9L,
                "9I",
                "2024-08-18",
                "11:15",
                "International Stadium",
                175300.99,
                SportRepository.getJudo()
            )
        )

        tickets.add(
            Ticket(
                10L,
                "11J",
                "2024-08-25",
                "13:45",
                "Olympic Park",
                210000.70,
                SportRepository.getTennis()
            )
        )


    }

    fun get() : List<Ticket> {
        return emptyList() //TODO Implementar solucion para obtener los tickets
    }

    fun getById(id: Long) : Ticket {
        return tickets[0] //TODO Implementar solucion para obtener el ticket solicitado
    }
    
}