package behavioralPatterns.observer

class WeatherStation : Observer {

    private val observables: ArrayList<Observable> = ArrayList()
    var temperature: Float = 0f

    override fun add(observable: Observable) {
        this.observables.add(observable)
    }

    override fun remove(observable: Observable) {
        this.observables.remove(observable)
    }

    override fun notifyObservers() {
        for (observable in observables) {
            observable.update()
        }
    }

}