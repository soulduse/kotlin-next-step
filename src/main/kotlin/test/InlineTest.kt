package test


/** * Created by developerkhy@gmail.com on 2018. 1. 7.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse */

fun main(args: Array<String>) {
    val person = Person().apply {
        name = "철수"
        age = 20
    }

    // 1
//    person.printInfo({println("person's info --> ${person.name}, ${person.age}")})
    // 2
//    person.printInfoInline({println("person's info --> ${person.name}, ${person.age}")})
    // 3
//    person.printBasic()
    // 4
    person.printBasicInline()
}

class Person{
    var name : String ?= null
    var age : Int ?= null

    init {
        println("construct Person")
    }

    fun printInfo(body: ()->Unit){
        println("onPreExecute()")
        body()
        println("onPostExecute()")
    }

    inline fun printInfoInline(body: ()->Unit){
        println("onPreExecute()")
        body()
        println("onPostExecute()")
    }

    fun printBasic(){
        println("onPreExecute()")
        println("person's info --> $name, $age")
        println("onPostExecute()")
    }

    inline fun printBasicInline(){
        println("onPreExecute()")
        println("person's info --> $name, $age")
        println("onPostExecute()")
    }
}