package creationalPatterns.factoryMethod

interface AnimalFactoryMethod {

    fun createAnimal(type: String): Animal
}