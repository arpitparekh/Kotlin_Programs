package assignment

fun main() {
    println("Enter Number : ")
    val number = readLine()!!.toInt()
    if(number%2==0){
        println("Number is even")
    }else{
        println("Number is Odd")
    }
}