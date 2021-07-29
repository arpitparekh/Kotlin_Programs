package assignment.arrays

fun main() {
    val row=2
    val column=3
    val arr1= arrayOf(intArrayOf(1,2,3), intArrayOf(1,2,3))
    val transpose=Array(column){IntArray(row)}
    for(i in 0 until row){
        for (j in 0 until column){
            transpose[j][i]=arr1[i][j]
        }

    }
    for (i in 0 until row){
        for(j in 0 until column){
            println(transpose[j][i])
        }

    }

}