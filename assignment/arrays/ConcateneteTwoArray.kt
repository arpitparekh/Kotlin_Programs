package assignment.arrays

fun main() {
    val arr1= intArrayOf(1,2,3,4,5,6,7)
    val arr2= intArrayOf(1,2,3,4,5,6,7)

    val concate= intArrayOf(*arr1,*arr2)

    println(concate.contentToString())

    println((arr1+arr2).contentToString())
}