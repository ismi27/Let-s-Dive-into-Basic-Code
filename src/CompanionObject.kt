fun main() {
    val person = Person("Ismi", 20)
    println(person.name)
    val minus=Person.min(2,1)
    println(minus)

}

class Person (val name: String){
    companion object{ //tanpa perlu membuat objek ketika memanggil
        fun min(num1:Int, num2:Int) = num1.minus(num2)
    }
    constructor(fullName: String, age:Int) : this(fullName){
        println("secondary constructor called")
    }
}