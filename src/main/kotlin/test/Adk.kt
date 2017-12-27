package test


/** * Created by developerkhy@gmail.com on 2017. 11. 21.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse */

sealed class Result
class Success(val message : String ): Result()
class Failure(val stateCode : Int ): Result()

fun failAlot():Unit{
    throw Exception("Blaaarg !!!")
}

//fun failAlot():Nothing{
//    throw Exception("Blaaarg !!!")
//}

// Nothing, Unit은 다르다.

fun getPage(url: String) : Result{
    if(url == ""){
        return Success("Message")
    }else{
        return Failure(404)
    }
}


fun main(args: Array<String>) {
//    val x = getPage("/something")
    val x = if(args.count() >0){
        20
    }else{
        failAlot()
    }
}