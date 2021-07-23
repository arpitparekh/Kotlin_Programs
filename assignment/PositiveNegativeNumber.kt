package assignment

fun main() {
    println("Enter the Number")
    val number= readLine()!!.toInt()
    if(number<0){
        println("Negative Number")
    }else {
        println("Positive Number")
    }
}