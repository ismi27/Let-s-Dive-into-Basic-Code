class ControlStructure {
    fun controlstructure() {
        var hours = readLine()!!.toInt()
        var total: Double = 0.0
        var day = 0
        if(hours>0 && hours <= 5){
            total = (hours * 1).toDouble()
            print("Biaya parkir : " + total+ " dollar")
        }
        else if(hours >5 && hours<=24){
            hours -= 5
            total = 5.0 + (hours *0.5)
            print("Biaya parkir : " + total + " dollar")
        }
        else{
            day = hours/24
            hours %= 24
            total = 15 * day + (hours *0.5)
            print("Biaya parkir : "+total.toDouble() + " dollar")
        }
    }
}

fun main(){
    val ct = ControlStructure()
    ct.controlstructure()
}