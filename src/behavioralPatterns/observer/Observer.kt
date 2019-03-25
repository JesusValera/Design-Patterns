package behavioralPatterns.observer

interface Observer {

    fun add(observable: Observable)
    fun remove(observable: Observable)
    fun notifyObservers()

}