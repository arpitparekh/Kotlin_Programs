package assignment.functions

import java.util.*

fun power(b:Int,p:Int):Long{
    return if(p!=0){
        b * power(b, p-1)
    }else {
        1
    }
}

fun main() {
    val scanner=Scanner(System.`in`)
    println("Enter base and power")
    val base=scanner.nextInt()
    val power=scanner.nextInt()
    println("$base^$power is : ${power(base,power)} ")

}