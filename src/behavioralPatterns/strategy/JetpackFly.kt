package behavioralPatterns.strategy

class JetpackFly: FlyBehavior {

    override fun fly(): String {
        return "*Motor engines running*"
    }

}