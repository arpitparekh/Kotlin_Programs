package assignment

import java.util.*
import kotlin.math.pow

fun main() {
    val scanner=Scanner(System.`in`)
    println("Enter first and last value")
    val n1=scanner.nextInt()
    val n2=scanner.nextInt()


    for(i in n1+1..n2 ){       // this is assignment.functions.main checkpoint
        var x=i
        var digit=0
        while (x>0){
            x/=10               //find digits
            digit++
        }
        var sum=0.0
        x=i
        while (x>0){
            val lastDigit=x%10
            sum+= lastDigit.toDouble().pow(digit.toDouble())        //find sum
            x/=10
        }
        if(sum.toInt() == i){
            println("$i")                   //check
        }
    }
}