package assignment

fun main() {
    println("Enter the String")
    var str:String?= ""

//    val isNullOrEmpty=str.isNullOrEmpty()  //using isNullOrEmpty() or isEmpty() or == or length
//    println(isNullOrEmpty)
    when(str){
        null-> println("String is Null")
        else-> println("String is Empty")
    }
}