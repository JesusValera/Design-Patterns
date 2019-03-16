package behavioralPatterns.strategy

class SimpleQuack : QuackBehavior {

    override fun quack(): String
    {
        return "Quack quack quack."
    }

}