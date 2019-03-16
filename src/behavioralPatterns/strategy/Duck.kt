package BehavioralPatterns.Strategy

class Duck(val quack: QuackBehavior, val fly: FlyBehavior) {

    fun quack() : String {
        return this.quack.quack()
    }

    fun fly() : String {
        return this.fly.fly()
    }
}