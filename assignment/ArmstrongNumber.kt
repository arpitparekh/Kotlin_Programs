package assignment

import java.util.*

fun main() {
    val scanner=Scanner(System.`in`)
    println("Enter the Number")
    var number=scanner.nextInt()
    val copyOfNumber=number
    var sum=0
    while(number>0){
        var digit=number%10
        sum+=digit*digit*digit
        number/=10
    }
    if(copyOfNumber==sum){
        println("Number is Armstrong Number")
    }else{
        println("Number is not Armstrong Number")
    }
}