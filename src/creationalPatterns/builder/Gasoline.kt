package creationalPatterns.builder

class Gasoline(
        override val calorificValue: Float = 21.3F,
        override val ignitionTemperature: Double = 72.23,
        override val moistureContent: Int = 53) : Fuel
