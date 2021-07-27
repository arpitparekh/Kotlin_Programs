package assignment.functions

import java.util.*

fun gcd(n1:Int,n2:Int):Int{
    return if(n2!=0) return gcd(n2,n1%n2) else n1
}

fun main() {
    val scanner=Scanner(System.`in`)
    val number=scanner.nextInt()
    val number2=scanner.nextInt()

    println("GCD of given number is ${gcd(number,number2)}")
}