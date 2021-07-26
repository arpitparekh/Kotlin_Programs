package assignment

import java.util.*

fun main() {
    val scanner=Scanner(System.`in`)
    println("Enter String")
    val givenString=scanner.nextLine()
    var consonant=0
    var vowel=0
    var space=0
    for(i in givenString){
        if(i=='a' ||i=='e' ||i=='i' ||i=='o' ||i=='u' ||i=='A' ||i=='E' ||i=='I' ||i=='O' ||i=='U' ){
            vowel++
        }
        else if(i==' '){
            space++
        }else{
            consonant++
        }

    }
    println("Number is vowel is $vowel and number of consonant is $consonant and space is $space")
}