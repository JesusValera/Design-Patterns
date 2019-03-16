package BehavioralPatterns.Strategy

class SimpleQuack : QuackBehavior {

    override fun quack(): String
    {
        return "Quack quack quack."
    }

}