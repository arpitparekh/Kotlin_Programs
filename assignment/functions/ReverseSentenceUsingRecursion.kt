package assignment.functions

import java.util.*

fun reverseSentence(str:String):String=if(str.isEmpty())str
    else reverseSentence(str.substring(1))+str[0]

fun main() {
    val scanner=Scanner(System.`in`)
    val str=scanner.nextLine()
    println("Reverse of given sentence is ${reverseSentence(str)}")

}