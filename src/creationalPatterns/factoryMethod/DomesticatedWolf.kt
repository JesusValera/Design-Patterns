package creationalPatterns.factoryMethod

class DomesticatedWolf: Animal {

    override fun makeSound(): String {
        return "I am a domestic wolf: woof."
    }
}