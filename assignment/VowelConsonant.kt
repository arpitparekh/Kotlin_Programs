package assignment

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter the character")
    val str=scanner.nextLine()
    if(str!=""){
        val ch=str[0]
        if(ch=='a' || ch=='e'||ch=='i' || ch=='o'||ch=='u' || ch=='A'||ch=='E' || ch=='I'||ch=='O' || ch=='U' )
        println("Vowel")
        else
        {
            println("Consonant")
        }
    }else {
        println("String is Empty")
    }


}