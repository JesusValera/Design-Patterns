package structuralPattern.decorator

class Soy(private val beverageSoy: Beverage): BeverageDecorator() {

    override val cost: Float
        get() = this.beverageSoy.cost + 2.2f

    override val description: String
        get() = this.beverageSoy.description + " with Soy"
}
