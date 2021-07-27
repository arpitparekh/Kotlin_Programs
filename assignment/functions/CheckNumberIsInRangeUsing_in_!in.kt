package assignment.functions

import java.util.*

fun checkNumber(n:Int):Boolean{
    return n !in 1..100
}

fun main() {
    val scanner=Scanner(System.`in`)
    println("Enter Number ")
    val number=scanner.nextInt()
    println("result is ${checkNumber(number)}")
}