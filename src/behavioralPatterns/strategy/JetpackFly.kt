package BehavioralPatterns.Strategy

class JetpackFly: FlyBehavior {

    override fun fly(): String {
        return "*Motor engines running* Fffrsssssssssshh."
    }

}