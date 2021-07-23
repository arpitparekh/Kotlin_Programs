package assignment
var frequency=0
fun main() {
    println("Enter String")
    val string= readLine()
    println("Enter character")
    val character= readLine()?.get(0)
    if (string != null) {
        for(i in string.indices){       //Returns an IntRange of the valid indices for this collection.
            if(character==string[i]){
                frequency++
            }
        }
    }
    println("Occurrence of Given Character is $frequency ")
}