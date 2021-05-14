fun printObject(any:Any){
    if (any is Nama){
        println("Namanya : ${any.nama}")
    }else if ( any is Buah){
        println("Ini buah : ${any.buah}")
    }else{
        println(any)
    }

    when(any){
        is Nama ->  println("Namanya : ${any.nama}")
        is Buah -> println("Ini buah : ${any.buah}")
        else -> println(any)
    }

    val nilai: String? = any as? String
    println(nilai)
}

fun main() {
    printObject("Ismi")
    printObject(1)
    printObject(Nama("Ismi"))
    printObject(Buah("apel"))
}

class Nama(val nama: String)
class Buah(val buah: String)