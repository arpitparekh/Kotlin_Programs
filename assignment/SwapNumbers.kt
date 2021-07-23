package assignment

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter First Number")
//    var n1=scanner.nextInt()
    var n1= readLine()!!.toInt()
    println("enter Second Number")
    var n2=scanner.nextInt()

    val temp=n2
    n2=n1
    n1=temp

    println("n1 is $n1 n2 is $n2")


}