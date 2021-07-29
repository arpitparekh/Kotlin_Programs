package assignment.arrays

import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

fun main() {
    var arr=StringArray()
     var line=""

    while(line!="exit"){

        val line= readLine()
        if(line!="exit"){
            arr.add(line)
        }else{
            break
        }
    }
    for(i in 0..arr.size){
        println(arr[i])
    }


}