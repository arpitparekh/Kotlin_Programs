package assignment

import java.util.*

fun main() {

    var  a=0
    var  b=1
    val scanner=Scanner(System.`in`)
    val range=scanner.nextInt()

    for(i in 1..range){
        print("  $a")
        val sum=a+b
        a=b
        b=sum
    }
}