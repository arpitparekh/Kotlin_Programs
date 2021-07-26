package assignment

import java.util.*

fun main() {
    val scanner=Scanner(System.`in`)
    println("Enter first value of Interval")
    var n1=scanner.nextInt()
    println("Enter second value of  Interval")
    var n2=scanner.nextInt()
    while (n1<n2){
        var flag=false
        for(i in 2..n1/2){
            if(n1%i==0){
                flag=true
                break
            }
        }
        if(!flag){
            println("$n1 ")
        }
        ++n1
    }
}