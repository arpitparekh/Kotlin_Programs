package assignment

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter First Floating Point Number")
    val firstPoint=scanner.nextFloat()
    println("Enter Second Floating Point Number")
    val secondPoint=scanner.nextFloat()
    val mul=firstPoint*secondPoint
    println("Multiplication is $mul")
}