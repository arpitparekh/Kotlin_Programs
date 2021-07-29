package assignment

class Person(val _id:Int,var _name:String,val _age:Int=45) {
    var email:String?=""
    init {

    }
    constructor(id:Int,name:String,email:String):this(id,name){

    }
    fun display(){
        println("id is $_id")
        println("name is $_id")
        println("email is $email")
    }
}

fun main() {
     val p1=Person(12,"Arpit",22)
    val p2=Person(12,"Pratik","arpitparekh9@gmail.com")
    p1.display()
    p2.display()
}