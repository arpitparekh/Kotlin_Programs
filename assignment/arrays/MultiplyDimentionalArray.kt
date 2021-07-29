package assignment.arrays

fun main() {
    val row=2
    val column=3
    val arr1= arrayOf(intArrayOf(1,2,3,), intArrayOf(1,2,3))
    val arr2= arrayOf(intArrayOf(1,2,3), intArrayOf(1,2,3))
    val mul=Array(row){
        IntArray(column)
    }
    for(i in 0 until row){
        for(j in 0 until column){
           mul[i][j]=arr1[i][j]*arr2[i][j]
        }
    }
    for(i in 0 until row){
        for(j in 0 until column){
            print(mul[i][j])
        }
        println()
    }
}