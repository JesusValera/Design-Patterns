package CreationalPatterns.Builder

interface Car {

    val price: Double
    val color: String
    val windowTinted: Boolean
    val seat: Int
    val fuel: Fuel

}