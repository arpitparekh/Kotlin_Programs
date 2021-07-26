package assignment.functions

import java.util.*

// check prime

fun checkPrime(number:Int):Boolean{

    var flag=true
    for(i in 2..number/2){
        if(number%i==0){
            flag=false
            break
        }
    }
    return flag
}

fun main() {
    val scanner=Scanner(System.`in`)
    val number=scanner.nextInt()
    for(i in 2..number/2){
       if(checkPrime(i) && checkPrime(i-1)){
           print("$number = $i + " + (number-i) + "\n")

       }
    }
}