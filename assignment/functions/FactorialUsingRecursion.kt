package assignment.functions

import java.util.*

fun factorial(number:Int):Long{
    return if(number==1) number.toLong() else number* factorial(number-1)
}

fun main() {
    val scanner= Scanner(System.`in`)
    val number=scanner.nextInt()
    val result= factorial(number)
    println("Factorial of given number is $result")
}