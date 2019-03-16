package behavioralPatterns.strategy

class NoFly: FlyBehavior {

    override fun fly(): String {
        return "Does jumping counts as flying?"
    }

}