package assignment

import java.math.RoundingMode
import java.text.DecimalFormat

fun main() {
    println("Enter Number")
    val number= readLine()?.toDouble()
//    println("%.1f".format(number))    //Round a Number using format


    val df=DecimalFormat("#.###")
    df.roundingMode=RoundingMode.CEILING  //Round a Number using DecimalFormat
    println(df.format(number))


}