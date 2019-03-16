package creationalPatterns.builder

class Opel(
        override val price: Double,
        override val color: String,
        override val windowTinted: Boolean,
        override val seat: Int,
        override val fuel: Fuel) : Car
