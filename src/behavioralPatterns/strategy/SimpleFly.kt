package BehavioralPatterns.Strategy

class SimpleFly: FlyBehavior {

    override fun fly(): String {
        return "flew flew"
    }

}