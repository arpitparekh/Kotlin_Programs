package assignment

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter Character : ")
    var str=scanner.next()
    if(str.length>1){
        println("Please Enter Character")
    }else{
        val character=str[0]
        println(character.code)
    }
}