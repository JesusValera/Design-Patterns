package structuralPattern.decorator

class Caramel(private val beverageCaramel: Beverage): BeverageDecorator() {

    override val cost: Float
        get() = this.beverageCaramel.cost + 1.6f

    override val description: String
        get() = this.beverageCaramel.description + " with Caramel"
}
