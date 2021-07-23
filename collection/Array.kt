package collection

fun main() {

    val interestingThings= arrayOf("one","two","three")
    val size=interestingThings.size
    println("size is $size")
    println(interestingThings[1])

    for(interestingThing in interestingThings){
        println(interestingThing)
    }
    interestingThings.forEach { interestingThing->
        println(interestingThing)
    }
}