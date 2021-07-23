const val hello: Int =1234
var hi:String?=null
fun main(){

//    hi="New Value"
    when(hi){
        null-> println("value is null")
        else-> println("value is:$hi")
    }
    println(hello)
}