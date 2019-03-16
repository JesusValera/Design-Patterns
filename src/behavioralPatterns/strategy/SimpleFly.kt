package behavioralPatterns.strategy

class SimpleFly: FlyBehavior {

    override fun fly(): String {
        return "'flew flew'."
    }

}