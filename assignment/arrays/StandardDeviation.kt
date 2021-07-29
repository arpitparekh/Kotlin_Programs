package assignment.arrays

import kotlin.math.pow
import kotlin.math.sqrt

fun findSD(arr:DoubleArray):Double{
    var standardDeviation=0.0
    var sum:Double=0.0
    for(i in arr){
        sum+=i
    }
    val mean=sum/arr.size
    for(i in arr){
        standardDeviation+= (i - mean).pow(2.0)

    }
    return sqrt(standardDeviation/arr.size)
}

fun main() {
    val arr:DoubleArray= doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0)
    println("standard deviation is ${findSD(arr)}")
}