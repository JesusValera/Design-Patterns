package structuralPattern.decorator

/**
 * Greetings: https://www.youtube.com/watch?v=GCraGHx6gso
 */
fun main() {

    val decaf: Beverage = Decaf()
    val espresso: Beverage = Espresso()

    val caramelDecaf : Beverage = Caramel(Decaf())
    val soyCaramelEspresso : Beverage = Soy(Caramel(Espresso()))

    getData(decaf, espresso, caramelDecaf, soyCaramelEspresso)
}

private fun getData(vararg beverage: Beverage) {
    print(beverage.joinToString(separator = "") {
        String.format("Beverage's name: %s\n" +
                "Price: %s\n" +
                "Description: %s\n" +
                "===========================\n",
                it.javaClass.simpleName, it.cost, it.description)
    })
}
