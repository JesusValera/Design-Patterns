package BehavioralPatterns.Strategy

class NoQuack : QuackBehavior {

    override fun quack(): String {
        return "Silence. . ."
    }

}