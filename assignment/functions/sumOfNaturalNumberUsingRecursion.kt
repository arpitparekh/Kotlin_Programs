package assignment.functions

import java.util.*

fun sumOfNaturalNumbers(n:Int):Int{
    return if(n!=0) n+ sumOfNaturalNumbers(n-1) else n
}

fun main() {

    val scanner= Scanner(System.`in`)
    val number=scanner.nextInt()
    println("Sum of Natural Number is ${sumOfNaturalNumbers(number)}")

}