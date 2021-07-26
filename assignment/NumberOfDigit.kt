package assignment

import java.util.*

fun main() {

    val scanner=Scanner(System.`in`)
    println("Enter the Number")
    var number=scanner.nextInt()
    var digit=0
    while(number>0){
        number /= 10
        digit++
    }
    println(digit)
}