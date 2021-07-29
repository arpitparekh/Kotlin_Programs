package assignment.functions


class Student{
     fun isPassed(number:Int):Boolean{
         return number >= 23
     }
}

fun Student.isScholar(number:Int):Boolean{   //not practical solution
    return number >70
}

fun String.add(s1:String,s2:String):String{   //use in preDefined Classes  //string

    return this+s1+s2
}
fun Int.add(n1:Int):Int{        //int
    return this+n1
}fun Int.findGreaterValue(n1:Int):Boolean{
    return this>n1
}

fun main() {

    val s1 =Student()

    val n1=12
    val n2=23

    println("sum is ${n1.add(n2)}")
    println("Given number is greater : ${n1.findGreaterValue(13)}")
    val str="Hello"
    val str2="World"
    val str3="Hey"

    println(str.add(str2,str3))


    println("Student is result is ${s1.isPassed(23)}")
    println("Student result is ${s1.isScholar(78)}")
}