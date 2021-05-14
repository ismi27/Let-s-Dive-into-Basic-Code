class KelasDanKonstruktor {
    var name = " "
    var age = 0
    constructor(
            nama : String
    ){
        name = nama
    }
    constructor(
            nama : String, a : Int
    ){
        name = nama
        age = a
    }
}
fun main(){
    val u1 = KelasDanKonstruktor("Ismi", 20)
    val u2 = KelasDanKonstruktor("Ismi")
    println(u1.name)
    println(u1)
    println(u2.age)
}
