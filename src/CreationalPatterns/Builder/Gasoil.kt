package CreationalPatterns.Builder

class Gasoil(
        override val calorificValue: Float = 26.5F,
        override val ignitionTemperature: Double = 71.002,
        override val moistureContent: Int = 47) : Fuel
