package assignment

import com.sun.xml.internal.fastinfoset.util.StringArray


fun main() {

    val b:Byte=1
    val i:Int=b.toInt()
    println(i)


    val a1=23u
    val a2=-23
    a2.unaryMinus()
    println(a2)


    val str="""
   hello
   hi
   How R u
   """.trimMargin()
    println(str)

    val myArrayNew=Array(5){
        it.toString()
    }
    myArrayNew.forEach { println(it) }

    val myArray= Array(5){ i->(i*i).toString()}
    myArray.forEach { println(it) }

    var cars= arrayOf("Honda","Tata","Toyota")
    cars.forEach { println(it) }
    println(cars[2])
    cars[2] = "Maruti"
    println(cars[2])

    val list:ArrayList<String> = ArrayList()
    list.add("Hello")
    list.add("Hi")
    list.add("Good Morning")
    println(list)

    if(list.size !in list.indices){
        println("True")
    }else{
        println("False")
    }
    println(list.indices+list.size)

    for(x in 1..100 step 4 ){
        println(x)
    }
    for(x in 9 downTo 0 step 2)
    {
        print(" $x")
    }

    val listNew= mutableListOf<String>("asfs","faffsa","afssafsa")

}
