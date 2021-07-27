package pattern

import java.util.*

fun main() {
    val scanner= Scanner(System.`in`)
    println("Enter the Number of Rows")
    val row=scanner.nextInt()
    for(i in 1..row){
        for(j in 1..i){
            print(i)
        }
        println()
    }
}