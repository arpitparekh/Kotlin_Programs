package assignment.functions

import kotlin.math.pow

fun findArmStrongNumbers(number1:Int,number2:Int){

    for(i in number1+1..number2){
        var x=i
        var digit=0
        while(x>0){
            x/=10
            digit++
        }
        var sum=0.0
        x=i
        while(x>0){
            val lastDigit=x%10
            sum+=lastDigit.toDouble().pow(digit.toDouble())
            x/=10
        }
        if(sum.toInt()==i && i>=100){
            println("$i")
        }
    }
}
fun main() {
    findArmStrongNumbers(1,1000)

}