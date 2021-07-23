package assignment

import java.util.*

fun main() {

    val scanner= Scanner(System.`in`)
    println("Enter First Number")
    val n1=scanner.nextInt()
    println("Enter Second Number")
    val n2=scanner.nextInt()

    var gcd=1
    var i=1

    while(n1>=i || n2>=i){
        if(n1%i==0 && n2%i==0){
            gcd=i
        }
        i++
    }
    println("Gcd is $gcd")
    val lcm=n1*n2/gcd
    println("lcm is $lcm")

}