package BehavioralPatterns.Strategy

fun main() {

    val wildDuck = Duck(SimpleQuack(), SimpleFly())
    val cityDuck = Duck(SimpleQuack(), NoFly())
    val rubberDuck = Duck(NoQuack(), JetpackFly())

    printInfo(wildDuck, cityDuck, rubberDuck)
}

fun printInfo(vararg duck: Duck): String {

    /*duck.map {

    }*/
    return  ""
}