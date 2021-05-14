open class Parent(var name: String, private var age: Int) {
    fun getAge():Int{
        if (age < 18){
            return 18
        }else
            return age
    }
    fun setAge(a: Int){
        if (a<0)
            age = 18
        else age = a
    }
}
class Child1(name: String, age: Int): Parent(name, age) {
}
class Child2(name: String, age: Int, var country: String): Parent(name, age) {
}
fun main(args: Array<String>) {
    val user = Child2("Ismi", 20, "INDO")
    println(user.name)
    //println(user.age) //tidak bisa diakses karena private
    user.setAge(20) //harus menggunakan setter dan getter
    val age = user.getAge()
    println(age)
}
