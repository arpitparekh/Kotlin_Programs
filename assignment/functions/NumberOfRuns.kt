package assignment.functions

import java.util.*

//number of occurrence

fun main() {
    val list= listOf(1,1,1,1,3,3,3,4,4,5)
    for(item in list){  //step is only using in integer not in list
        println(list+":"+Collections.frequency(list,item))  //check frequency of item in collection
    }
}