package assignment.functions

fun lengthOfString(str:Any?):Int{
    return if(str is String){
        str.length
    }else{
        0
    }
}

fun main() {
    println("Enter the String")
    val str= readLine()
    println("Length of String is ${lengthOfString(str)}")
}