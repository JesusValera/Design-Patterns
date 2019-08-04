package creationalPatterns.factoryMethod

class WildAnimalFactoryMethodMethod : AnimalFactoryMethod {

    public override fun createAnimal(type: String) = when {
        type === "wolf" -> WildWolf()
        type === "snake" -> WildSnake()
        else -> throw Exception("No animal")
    }
}