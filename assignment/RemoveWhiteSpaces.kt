package assignment

import java.util.*

fun main() {
    val scanner=Scanner(System.`in`)
    println("Enter String")
    var str= scanner.nextLine()
    val newStr=str?.replace("\\s".toRegex(),"")

    //   ?. performs a safe call (calls a method or accesses property if the receiver is non-null)

    println(newStr)
}