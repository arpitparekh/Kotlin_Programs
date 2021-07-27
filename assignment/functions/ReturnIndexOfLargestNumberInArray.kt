package assignment.functions

fun findIndex(a:IntArray):Int?{
    return if(a.isEmpty()){
        null
    }else{
        var largest = a[0]

        for (num in a) {
            if (largest < num)
                largest = num
        }
        a.indexOf(largest)
    }
}

fun main() {
    val myArray= intArrayOf(1,2,3,5,66,433,22,44)
    println("Index of max number in array is : ${findIndex(myArray)}")
}