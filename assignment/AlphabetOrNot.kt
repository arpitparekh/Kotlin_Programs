package assignment

fun main() {

    println("Enter the Alphabet/character")
    val str= readLine()
    if(str!=""){
        val ch= str?.get(0)
        if (ch != null) {
            if(ch.code in 65..90 || ch.code in 97..122){
                println("Character is alphabet")
            }else{
                print("character is not alphabet")
            }
        }
    }else {
        println("enter the character")
    }
}