package assignment

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter the Number")
    var number=scanner.nextInt()
    val newNumber=number
    var reverse=0
    while(number>0){
        var lastDigit=number%10
        reverse=reverse*10 + lastDigit
        number/=10
    }
    if(reverse==newNumber){
        println("Number is palindrome")
    }
    else{
        println("Number is not a palindrome")
    }
}