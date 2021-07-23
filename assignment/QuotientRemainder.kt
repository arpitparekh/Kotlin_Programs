package assignment

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter Dividend")
    val dividend=scanner.nextInt()
    println("Enter  Divisor")
    val divisor=scanner.nextInt()

    val quotient:Double=(dividend/divisor).toDouble()
    val reminder:Double=(dividend%divisor).toDouble()

    println("Quotient is $quotient and Reminder is $reminder")
}