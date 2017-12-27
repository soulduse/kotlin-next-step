package com.next.step.ch02

/** * Created by developerkhy@gmail.com on 2017. 12. 27.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse */ 
class TestCalculator{

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val cal = Calculator()
            println(cal.add(3, 4))
            println(cal.subtract(5, 4))
            println(cal.multiply(2, 6))
            println(cal.divide(8, 4))
        }
    }
}
