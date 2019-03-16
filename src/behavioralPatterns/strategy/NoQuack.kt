package behavioralPatterns.strategy

class NoQuack : QuackBehavior {

    override fun quack(): String {
        return "***"
    }

}