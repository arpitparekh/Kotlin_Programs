package assignment

fun main() {
    val orderList= arrayOf("pizza","sandwich","coke","frankie")
    val size=orderList.size
    for (i in 0..2){
        for(j in 1..3){
            if(orderList[i].compareTo(orderList[j])>0){
                val temp=orderList[i]
                orderList[i]=orderList[j]
                orderList[j]=temp
            }
        }
    }
    println("Lexicographical Order :")
    for(i in 0..3){
        println(orderList[i])
    }
}