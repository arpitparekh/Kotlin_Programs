package assignment

import java.util.*

fun main() {
     val scanner=Scanner(System.`in`)
    println("Enter Number")
    val number=scanner.nextInt()
    println("Enter Power")
    val power=scanner.nextInt()

    val result=Math.pow(number.toDouble(),power.toDouble())

    println("Answer $result")


}