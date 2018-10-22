package CreationalPatterns.Builder

class Vehicle {

    private val cars: ArrayList<Car> = ArrayList()

    fun addCar(car: Car) {
        cars.add(car)
    }

    fun getTotalPrice(): Double {
        return cars.stream().mapToDouble { it.price }.sum()
    }

    fun getInfo(): String {
        var result = ""
        cars.forEach {
            result += String.format("Brand: %s\n" +
                    "Color: %s\n" +
                    "Are windows tinted? %b\n" +
                    "Number of seats are %d\n" +
                    "Fuel type: %s\n" +
                    "\t+ Calorific value: %.2f\n" +
                    "\t+ Ignition temperature: %.3f\n" +
                    "\t+ Moisture content: %d" +
                    "\n==================================\n",
                    it.javaClass.simpleName, it.color, it.windowTinted,
                    it.seat, it.fuel.javaClass.simpleName, it.fuel.calorificValue,
                    it.fuel.ignitionTemperature, it.fuel.moistureContent)
        }

        return result
    }
}
