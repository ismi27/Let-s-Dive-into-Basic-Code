abstract class AbstractClass (var name : String, var age : Int){

abstract  fun display()
}

class ChildSatu(name:String, age: Int):AbstractClass(name, age){
    override fun display() {
        println(name + " is " + age + " years old")

    }
}

class ChildDua(name: String, age: Int, var country: String):AbstractClass(name, age){
    override fun display() {
        println(name + " is from " + country)
    }
}

fun main(){
    val a = ChildSatu("Ismi", 20)
    a.display()
    val b  = ChildDua("Ismi", 20, "Indo")
    b.display()
}