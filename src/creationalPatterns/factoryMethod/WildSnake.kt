package creationalPatterns.factoryMethod

class WildSnake: Animal {

    override fun makeSound(): String {
        return "I am a wild snake: zZZzzzz."
    }
}