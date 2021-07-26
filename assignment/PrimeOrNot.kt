package assignment

import java.util.*

fun main() {
    val scanner=Scanner(System.`in`)
    println("Enter the Number")
    val number=scanner.nextInt()
    var  flag=false
    for(i in 2..number/2){
        if(number%i==0){
            flag=true
            break
        }
    }
    if (!flag){
        println("$number is Prime")
    }else{
        println("$number is not Prime")
    }
}