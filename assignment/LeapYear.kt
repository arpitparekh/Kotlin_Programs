package assignment

fun main() {
    println("Enter Year")
    val year= readLine()?.toInt()
    if (year != null) {
        if(year%4==0){
            println("Leap year")
        } else{
            println("Not Leap Year")
        }
    }
}