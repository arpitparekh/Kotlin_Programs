package collection

//vararg = To pass a variable number of arguments to a function

fun greeting(hello:String,vararg thingsToSay:String){  // using vararg
    thingsToSay.forEach{thing->
        println("$hello $thing")
    }
}
fun greeting2(hello:String,thingsToSay:List<String>){  // without vararg
    thingsToSay.forEach { thing->
        println("$hello -> $thing")
    }
}

fun main() {

    //ArrayList
    val arrayList=ArrayList<String>()
    arrayList.add("arpit")
    arrayList.add("pratik")
    arrayList.add("vimal")
    for(i in arrayList){
        println(i)
    }

    //List mutable and immutable
    val things= mutableListOf("Honda","yamaha","Suzuki","Harley")
    things.add("Hero")
    things.forEach { thing->
        println("bike->$thing")
    }

    //Map mutable and immutable
    val map = mutableMapOf(1 to "a",2 to "b",3 to "c")
    map[4] = "d"
    map.forEach{ (key, value) ->
        println("$key->$value")
    }
    val itemArray= arrayOf("car","bike","scooter","plane")
//    val thingsToSay= mutableListOf("Arpit","Pratik","Shraddha")
//    greeting("hi","Arpit","Urvi","Pratik")
    greeting("hi",*itemArray)     // use Asterisk for using array in vararg function
    greeting(thingsToSay = *itemArray,hello = "hi")  // explicit parameters
    

}