abstract class Plant

sealed class Fruit : Plant()

class Apple : Fruit()

sealed class Vegetable : Plant()

class Potato : Vegetable()

fun getPlant() : Plant = Potato()

fun main() {
    val somePlant = getPlant()
    when(somePlant){
        is Fruit -> println("is it Fruit")
        is Vegetable -> println("is it Potato")
    }
}