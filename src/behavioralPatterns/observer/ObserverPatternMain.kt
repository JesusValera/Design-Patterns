package behavioralPatterns.observer

/**
 * Greetings: https://www.youtube.com/watch?v=_BpmfnqjgzQ
 */
fun main() {

    val weatherStation = WeatherStation()
    weatherStation.temperature = 30f

    val lcdDisplay = LCDDisplay(weatherStation)
    val windowDisplay = WindowDisplay(weatherStation)

    weatherStation.add(lcdDisplay)
    weatherStation.add(windowDisplay)
    weatherStation.notifyObservers()

    printTemperature("1. The displays have been added! {Temperature is 30℃}", lcdDisplay, windowDisplay)

    weatherStation.temperature = 35f
    weatherStation.notifyObservers()

    printTemperature("2. Updating weather station. {Temperature is 35℃}", lcdDisplay, windowDisplay)

    weatherStation.remove(lcdDisplay)
    weatherStation.temperature = 22f // windowDisplay won't be updated, so it will showing 35℃.
    weatherStation.notifyObservers()

    printTemperature("3. Removing LCD display. {Temperature is 22℃}", lcdDisplay, windowDisplay)
}

fun printTemperature(message: String, lcdDisplay: LCDDisplay, windowDisplay: WindowDisplay) {
    println(message)
    println("\t** LCD Display **")
    println("\t -> Temperature: ${lcdDisplay.display()}℃")
    println("\t** Window Display **")
    println("\t -> Temperature: ${windowDisplay.display()}℃")
    println()
}