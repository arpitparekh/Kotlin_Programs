package class_object

class ClassIntroduction constructor(var firstName:String="Arpit", var lastName:String="Parekh") {

//    constructor():this("Arpit","Parekh")

    var nickName:String?=null

    init {
        println("init1")
    }
    init {
        println("init2")
    }
//    constructor():this("Arpit","Parekh"){
//        println("Secondary Constructor")
//    }


//    val firstName: String =_firstName
//    val lastName: String = _lastName

    //The primary constructor cannot contain any code.
    // Initialization code can be placed in initializer blocks prefixed with the init keyword.

//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }
}