package assignment

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter the Number")
    var i = scanner.nextInt()
    var factorial:Long=1
    for(number in 1..i){
        factorial *= number
    }

}