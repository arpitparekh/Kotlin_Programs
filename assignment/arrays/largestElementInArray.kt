package assignment.arrays

fun findLargestElement(arr:IntArray):Int{
    var element=arr[0]
    for(i in arr.indices){
        if(arr[i]>element){
            element=arr[i]
        }
    }
    return element
}

fun main() {
    val arr= intArrayOf(1,2,3,4,5,6,7,8,9,10)
    println("largest element in array is ${findLargestElement(arr)}")
}