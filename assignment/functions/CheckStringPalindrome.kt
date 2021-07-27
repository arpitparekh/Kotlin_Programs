package assignment.functions

import java.util.*

fun checkPalindrome(str:String):Boolean{
    val bufferString=StringBuffer(str)
    val reverseString=bufferString.reverse().toString()
    return reverseString == str
}

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter the String")
    val str= scanner.nextLine()
    println("Result : ${checkPalindrome(str)}")
}