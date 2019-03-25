package behavioralPatterns.observer

class LCDDisplay(private val observer: WeatherStation) : Observable, Display {

    private var temperature: Float = 0f

    override fun update() {
        this.temperature = this.observer.temperature
    }

    override fun display() = temperature
}