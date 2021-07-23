package assignment

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter first Number")
    val n1=scanner.nextInt()
    println("Enter second Number")
    val n2=scanner.nextInt()
    var gcd=1
    var i=1
    while(i<=n1 || i<=n2){
        if(n1%i==0 && n2%i==0){
            gcd=i
        }
        ++i
    }
    println("GCD is $gcd")


}