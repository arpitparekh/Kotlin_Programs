package assignment

import java.util.*

fun main() {

    val scanner=Scanner(System.`in`)
    println("Enter the Number to find multiplication table")
    val number=scanner.nextInt()
    for(i in 1..10){
        println("$number * $i ="+(number*i))
    }
}