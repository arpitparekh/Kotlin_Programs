package assignment

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter the Number")
    val number=scanner.nextInt()
    println("Factors are...")
    for(i in 1..number){
        if(number%i==0){
            println("$i")
        }
    }
}