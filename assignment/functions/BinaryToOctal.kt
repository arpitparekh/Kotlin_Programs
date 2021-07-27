package assignment.functions

import java.util.*
import kotlin.math.pow

fun binaryToOctal(binary:Long):Int{
    var binary=binary
    var octal=0
    var decimal=0
    var i=0
    while(binary.toInt()!=0){
        decimal+=(binary%10 * 2.0.pow(i.toDouble())).toInt()
        binary/=10
        ++i
    }
    i=1
    while(decimal!=0){
        octal+=decimal%8 * i
        decimal/=8
        i*=10
    }
    return octal
}

fun octalToBinary(octal:Int):Long{
    var octal=octal
    var decimal=0
    var binary:Long=0
    var i=0
    while(octal!=0){
        decimal+=(octal%10* 8.0.pow(i.toDouble())).toInt()
        octal/=10
        i++
    }
    i=1
    while(decimal!=0){
        binary+=(decimal%2*i)
        decimal/=2
        i*=10
    }
    return binary
}

fun main() {

    val scanner=Scanner(System.`in`)
    println("Enter Number to Convert")
    val number=scanner.nextLong()
    val string="""
        1:Binary To Octal
        2:Octal To binary
    """.trimIndent()
    println(string)
    when(scanner.nextInt()){
        1-> println("Binary $number in Octal is ${binaryToOctal(number)}")
        2-> println("Octal $number in binary is ${octalToBinary(number.toInt())}")
    }
}