package assignment

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter Three numbers")
    val n1=scanner.nextInt()
    val n2=scanner.nextInt()
    val n3=scanner.nextInt()
    if(n1>=n2 && n1>=n3){
        println("$n1 greater")
    }else if(n2>=n3 && n2>=n1){
        println("$n2 greater")
    }else if(n3>=n1 && n3>=n2){
        println("$n3 greater")
    }
}