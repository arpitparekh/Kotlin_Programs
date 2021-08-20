fun main() {

    val i =44
    val name:String="Arpit"
    when(i){
        12-> println("notFound")
        23-> println("Found")
    }
    when(name){
        "Arpit","Pratik","Shraddha","Mrudul","Rahul"-> println("Found")
        else-> println("Not Found")
    }

    val result=when(i)
    {
        12->23
        23->45
        else->44
    }
    println(result)

    when(i){
        in 1..45-> println("Found")
        else-> println("Not Found")
    }

    val firstName : Any ="Parekh"

    when(firstName){

        is Int -> println("Variable is int")
        is String-> println("Variable is String")
        is Double -> println("Variable is Double")

    }
    if(firstName is String){
        println("True")
    }else{
        println("False")
    }

    fun addTwo(x:Int) : Int = x+x

    val resultNew = when(i){

        addTwo(22) -> 34
        else -> 44


    }
    println(resultNew)

}