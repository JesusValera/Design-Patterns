package behavioralPatterns.strategy

class Duck(val name: String, private val quack: QuackBehavior, private val fly: FlyBehavior) {

    fun quack() : String {
        return this.quack.quack()
    }

    fun fly() : String {
        return this.fly.fly()
    }
}