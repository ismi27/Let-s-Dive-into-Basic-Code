fun main() {
    val user1 = User("Ismi", 20)
    val user3 = User("Rizki", 24)
    val user2:User=user1.copy(age = 32)
    val (uName:String, age:Int) = user2
    println(user1)
    println(user2)
    println(uName)
    println(age)
    println(user1.user)
    println(user2.component1())
    println(user2 == user1)
    println(user3.component2())
}

data class User(val user: String, val age: Int=23)