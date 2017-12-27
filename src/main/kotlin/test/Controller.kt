package test


/** * Created by developerkhy@gmail.com on 2017. 11. 21.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse */
//
//interface Repository{
//    fun getAll()
//}
class Controller(repository: Repository):Repository by repository {


//    fun getIndex(){
//        getAll()
//    }

    fun test(){

        val numbers = 1..100

        numbers.filter { it< 50 }.map { it * 100 }.sortedBy { it }
        println(numbers.asSequence()) // 시퀀스란?


    }

//    infix

//    typealias




    fun examFor(){
        val numbers = 1..100
        numbers.forEach{
            if(it == 5){
                return
            }
        }

        println("Hello")
    }




    fun main(args : Array<String>){
//        examFor()
        test()
    }

}

