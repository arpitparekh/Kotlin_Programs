package assignment.arrays

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    val arr=Array(5){0}
    for(x in arr.indices){
        arr[x]=scanner.nextInt()
    }
    arr.forEach {
        println(it)
    }
}