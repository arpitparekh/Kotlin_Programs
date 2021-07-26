package assignment

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter Number")
    var number=scanner.nextInt()
    var reverse=0
    while(number>0){
        var lastDigit=number%10
        reverse= reverse*10 + lastDigit
        number/=10
    }
    println(reverse)
}