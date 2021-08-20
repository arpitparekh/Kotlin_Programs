import java.lang.Integer.parseInt

fun main() {

    var a=IntArray(5)
    for(i in 0..4){
        val data= readLine()?.toInt()
        if (data != null) {
            a[i]=data
        }
    }
    for(i in 0..4){
        println(a[i])
    }
}