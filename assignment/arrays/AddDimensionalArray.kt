package assignment.arrays


fun main() {
    val row=2
    val column=3
    val arr1= arrayOf(intArrayOf(1,2,4), intArrayOf(1,2,4))
    val arr2= arrayOf(intArrayOf(1,2,4), intArrayOf(1,2,4))
    val sum=Array(row){IntArray(column)}
    for(i in 0 until row){
        for(j in 0 until column){
            sum[i][j]=arr1[i][j]+arr2[i][j]
        }

    }
    for(i in 0 until row){
        for (j in 0 until column){
            print(sum[i][j])
        }
        println()
    }
}