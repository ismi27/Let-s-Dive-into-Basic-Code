enum class Enum (val tipetas : String) {
    TOTEBAG("tote bag"),
    BACKPACK("backpack"),
    WAISTBAG("waist bag")
}

class Tas(val namatas: String, val type : Enum){
    init {
        println(
                "$namatas bahasa inggrisnya $type"
        )
    }
}

fun main(){
    val taske1 = Tas("Tas Selempang", Enum.TOTEBAG)
    val taske2 = Tas("Tas Gendong", Enum.BACKPACK)
    val taske3 = Tas("Tas Pinggang", Enum.WAISTBAG)

    for (Enum in Enum.values()){
        println(Enum.tipetas)
    }
}