package behavioralPatterns.strategy

/**
 * Greetings: https://www.youtube.com/watch?v=v9ejT8FO-7I
 */
fun main() {

    val wildDuck = Duck("Wild duck", SimpleQuack(), SimpleFly())
    val cityDuck = Duck("City duck", SimpleQuack(), NoFly())
    val rubberDuck = Duck("Rubber duck", NoQuack(), JetpackFly())

    printInfo(wildDuck, cityDuck, rubberDuck)
}

fun printInfo(vararg duck: Duck) {
    print(duck.joinToString(separator = "") {
        String.format("Duck's name: %s\n" +
                "The duck says: %s\n" +
                "The duck flies: %s\n" +
                "===========================\n",
                it.name, it.quack(), it.fly())
    })
}
