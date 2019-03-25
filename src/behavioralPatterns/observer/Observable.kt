package behavioralPatterns.observer

interface Observable {

    // We need to pass to the observable a reference of the observer to be able to update
    //  the data from the observer instead to ask each X milliseconds/seconds about changes.
    // So, we can pass the observer's object through constructor or even the update() method.
    fun update()

}