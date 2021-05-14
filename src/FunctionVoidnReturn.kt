class FunctionVoidnReturn {
    fun kembalikan(angkapertama: Int, angkakedua: Int): Int{
        return (angkapertama % angkakedua)
    }
    fun void(){
        var x:Int = 3
        var y:Int = 4
        var moduloxy = x%y
        println(moduloxy)
    }
}

fun main(){
    val fungsi = FunctionVoidnReturn()
    println(fungsi.kembalikan(3,4))
    println(fungsi.void())
}