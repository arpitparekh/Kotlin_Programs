package assignment

import kotlin.math.sqrt

fun main() {

    val a=3.5
    val b=4.5
    val c=6
    val root1:Double
    val root2:Double
    val result:String

    val determinnant=b*b-4.0*a*c

    if(determinnant>0){
        root1=(-b+ sqrt(determinnant))/(2*a)
        root2=(-b- sqrt(determinnant))/(2*a)

        result="root1 : $root1 and root2 : $root2"

        println(result)
    }else if(determinnant==0.0){
        root2=-b/(2*a)
        root1=root2

        result="root1 : $root1 and root2 : $root2"
        println(result)
        //if roots are not real
    }else{
        val realPart=-b/(2*a)
        val imaginaryPart= sqrt(-determinnant)/(2*a)

        result="$realPart and $imaginaryPart are the roots"
        println(result)
    }
}