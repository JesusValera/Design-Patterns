package creationalPatterns.factoryMethod

class DomesticatedAnimalFactoryMethodMethod : AnimalFactoryMethod {

    public override fun createAnimal(type: String) = when {
        type === "wolf" -> DomesticatedWolf()
        type === "snake" -> DomesticatedSnake()
        else -> throw Exception("No animal")
    }
}