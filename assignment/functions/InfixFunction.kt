package assignment.functions

infix fun Int.addNumber(n1:Int):Int{

    return this+n1
}

fun main() {
    val n1=12
    val n2=23

    println("sum is ${n1 addNumber n2}")  //is same as n1.addNumber(n2)  //easy wat to understand

    //they can have only parameter
    //all infix function are extension function but not all extension functions are infix

}