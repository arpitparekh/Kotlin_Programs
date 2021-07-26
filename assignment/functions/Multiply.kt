package assignment.functions

fun multiply(number1:Int?,number2:Int?){
    if(number1==null || number2==null){
        println("One of the number is null")
    }else{
        println(number1*number2)
    }
}

fun main() {

    multiply(8,5)
}