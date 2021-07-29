package assignment.arrays

fun findAverage(arr: IntArray): Double {
    val sum = arr.sum()
    return (sum / arr.size).toDouble()


}

fun main() {
    val arr:IntArray= intArrayOf(1,2,43,4,5,6,7,8,9,10)
    println("average is ${findAverage(arr)}")

}