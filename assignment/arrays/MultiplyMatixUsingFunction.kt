package assignment.arrays

fun multiplyTwoDimensionalMatrix(arr:Array<IntArray>,arr2:Array<IntArray>,row:Int,column:Int){

    val mul=Array(row){IntArray(column)}
    for(i in 0 until row) {
        for (j in 0 until column) {
            mul[i][j] = arr[i][j] * arr2[i][j]
        }
    }
        for(i in 0 until row){
            for(j in 0 until column){
                print(mul[i][j])
            }
            println()
        }
    }


fun main() {
    val row=2
    val column=3

    val array1= arrayOf(intArrayOf(1,2,3), intArrayOf(1,2,3))
    val array2= arrayOf(intArrayOf(1,2,3), intArrayOf(1,2,3))

    multiplyTwoDimensionalMatrix(array1,array2,row,column)


}