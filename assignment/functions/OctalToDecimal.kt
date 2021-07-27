package assignment.functions

import java.util.*
import kotlin.math.pow

fun decimalToOctal(decimal:Int):Int{

    var decimal=decimal
    var octalNumber=0
    var i=1
    while(decimal!=0){
        octalNumber += decimal % 8 * i
        decimal/=8
        i*=10
    }
    return octalNumber
}

fun octalToDecimal(octal:Int):Int{
    var octal=octal
    var decimal=0
    var i=0
    while(octal!=0){
        decimal+=(octal % 10 * 8.0.pow(i.toDouble())).toInt()
        octal/=10
        ++i
    }
    return decimal
}

fun main() {
    val scanner=Scanner(System.`in`)

    println("Enter Number u Want to Convert")
    val number=scanner.nextInt()

    val string="""
        Choose One
        1:decimal to octal
        2:octal to decimal
    """.trimIndent()
    println(string)

    val choice=scanner.nextInt()

    when(choice){
        1->println("decimal $number in octal is ${decimalToOctal(number)}")
        2-> println("octal $number in decimal is ${octalToDecimal(number)}")
        else-> println("Choose Properly")
    }

}