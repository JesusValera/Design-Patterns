package CreationalPatterns.Builder

fun main(args: Array<String>) {
    val vehicle = Vehicle()

    val opel = Opel(7_200.0,"red", false, 7, Gasoline(ignitionTemperature = 69.11))
    val seat = Seat(6_500.0, "white", false, 5, Gasoline())
    val mercedes = Mercedes(22_900.0, "gray", true, 5, Gasoil(29.9F, 86.0, 49))
    val peugeot = Peugeot(13_600.0, "black", true, 2, Gasoline())
    vehicle.addCar(opel)
    vehicle.addCar(seat)
    vehicle.addCar(mercedes)
    vehicle.addCar(peugeot)

    print(vehicle.getInfo())
    println("Total price of all cars: ${vehicle.getTotalPrice()}")
}
