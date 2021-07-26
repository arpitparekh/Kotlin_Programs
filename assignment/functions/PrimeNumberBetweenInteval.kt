package assignment.functions

fun findPrimeNumbers(number1:Int, number2: Int){

    var n1=number1

    while (n1 < number2) {
        var flag = false
        for (i in 2..n1 / 2) {
            if (n1 % i == 0) {
                flag = true
                break
            }
        }
        if (!flag) {
            print("$n1 ")
        }
         ++n1
    }
}
fun main() {
    findPrimeNumbers(1,100)
}