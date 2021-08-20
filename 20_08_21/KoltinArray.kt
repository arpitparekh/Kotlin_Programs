import java.util.*

fun main() {

    //implicit type

    val arr= arrayOf(1,3,2)

    // explicit

    val arr2= arrayOf<Int>(1,2,3,5)

    // second way

    val num=Array(6,{i->i*2})   // type ?

    val mtArray=IntArray(5)



    for(i in 0..num.size-1){
        println(num[i])
    }

    val demoArr= arrayOf(1,2,3,4,5,6)

    demoArr[3]=44

    println(Arrays.toString(demoArr))

    demoArr.set(0,55)

    println(Arrays.toString(demoArr))








}