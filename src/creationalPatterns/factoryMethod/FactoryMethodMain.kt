package creationalPatterns.factoryMethod

/**
 * Greetings: https://www.youtube.com/watch?v=EcFVTgRHJLM&t
 */
fun main() {

    val wildAnimals: AnimalFactoryMethod = WildAnimalFactoryMethodMethod()
    val domesticAnimals: AnimalFactoryMethod = DomesticatedAnimalFactoryMethodMethod()

    val wildWolf = wildAnimals.createAnimal("wolf")
    val wildSnake = wildAnimals.createAnimal("snake")

    val domesticWolf = domesticAnimals.createAnimal("wolf")
    val domesticSnake = domesticAnimals.createAnimal("snake")

    printInfo(wildWolf, wildSnake, domesticWolf, domesticSnake)
}

fun printInfo(vararg animal: Animal) {
    print(animal.joinToString(separator = "") {
        String.format("%s: %s\n",
                it.javaClass.simpleName, it.makeSound())
    })
}
