package creationalPatterns.factoryMethod

class DomesticatedSnake: Animal {

    override fun makeSound(): String {
        return "I am a domestic snake: zZZzzzz."
    }
}