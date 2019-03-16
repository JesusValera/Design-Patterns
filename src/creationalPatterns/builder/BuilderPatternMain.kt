package creationalPatterns.builder

/**
 * Greetings: https://www.youtube.com/watch?v=v9ejT8FO-7I
 */
fun main() {

    val opel = CarBuilder().buildOpel()
    val seat = CarBuilder().buildSeat()
    val mercedes = CarBuilder().buildMercedes()
    val peugeot = CarBuilder().buildPeugeot()

    val vehicle = Vehicle()
    vehicle.addCar(opel)
    vehicle.addCar(seat)
    vehicle.addCar(mercedes)
    vehicle.addCar(peugeot)

    printInfo(vehicle)
}

fun printInfo(vehicle: Vehicle) {
    print(vehicle.getInfo())
    print("Total price of all cars: %.2f €".format(vehicle.getTotalPrice()))
}
