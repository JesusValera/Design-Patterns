package CreationalPatterns.Builder

class CarBuilder {

    fun buildOpel(): Car {
        val gasoline: Fuel = Gasoline(ignitionTemperature = 69.11)

        return Opel(7_200.0, "red", false, 7, gasoline)
    }

    fun buildSeat(): Car {
        val gasoline: Fuel = Gasoline()

        return Seat(6_500.0, "white", false, 5, gasoline)
    }

    fun buildMercedes(): Car {
        val gasoil: Fuel = Gasoil(29.9F, 86.0, 49)

        return Mercedes(22_900.0, "gray", true, 5, gasoil)
    }

    fun buildPeugeot(): Car {
        val gasoline: Fuel = Gasoline()

        return Peugeot(13_600.0, "black", true, 2, gasoline)
    }
}
