var helloNew:String?=null
val number:Int=1234
fun main() {
//    when(helloNew){
//
//        null-> println("Null Value")
//        else-> println("Value is not null")
//    }
//    val printStirng = if(helloNew!=null) helloNew else "null"
    helloNew="Hi Kotlin"
    val printStirng=when(helloNew){
        null->"Null Value"
        else->helloNew
    }
    println(printStirng)
    println(number)
}