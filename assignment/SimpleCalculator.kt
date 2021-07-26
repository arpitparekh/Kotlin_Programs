package assignment

import java.util.*

fun main() {
    val scanner=Scanner(System.`in`)
    println("Enter First Number")
    val number1=scanner.nextDouble()
    println("Enter Second Number")
    val number2=scanner.nextDouble()
    println("""
        1->sum
        2->division
        3->multiplication
        4->division
    """.trimIndent())
    println("Choose One")
    var choose=scanner.nextInt()
    when(choose){
        1-> println("sum is "+(number1+number2))
        2-> println("subtraction is "+(number1-number2))
        3-> println("multiplication is "+(number1*number2))
        4-> println("divition is "+(number1/number2))
        else-> println("Choose right number")
    }
}