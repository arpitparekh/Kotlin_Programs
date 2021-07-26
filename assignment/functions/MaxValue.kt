package assignment.functions

fun maxNumber(first:Int,second:Int){
    if(first>second){
        println("$first in higher")
    }else {
        println("$second is higher")
    }
}

fun maxNumberInList( list:List<Int>){
    val max= list.maxOrNull()
    println(max)
}


fun main() {
    maxNumber(15,16)
    val myList= listOf(1,2,3,4,5,6,7,8,10,45,5,6,7)
    maxNumberInList(myList)
}