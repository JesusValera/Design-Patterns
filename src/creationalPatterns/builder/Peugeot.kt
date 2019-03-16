package creationalPatterns.builder

class Peugeot(
        override val price: Double,
        override val color: String,
        override val windowTinted: Boolean,
        override val seat: Int,
        override val fuel: Fuel) : Car
