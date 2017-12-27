package com.next.step.ch02

import java.util.regex.Pattern


/** * Created by developerkhy@gmail.com on 2017. 12. 27.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse */
class StringCalculator {

    fun add(text : String?): Int?{
        if (isBlank(text)) {
            return 0
        }

        return sum(toInts(split(text)!!))
    }

    private fun isBlank(text: String?): Boolean {
        if (text.isNullOrEmpty()) {
            return true
        }
        return false
    }

    private fun split(text: String?): List<String>? {
        val m = Pattern.compile("//(.)\n(.*)").matcher(text)
        if(m.find()){
            val customDelimeter = m.group(1)
            return m.group(2).split(customDelimeter)
        }

        return text?.split(",", ":")
    }

    private fun toInts(values : List<String>): List<Int> {
        return values.map {
            val intValue = it.toInt()
            if(intValue < 0){
                throw RuntimeException()
            }

            intValue
        }
    }

    private fun sum(numbers: List<Int>?): Int {
        var sum = 0
        numbers?.forEach {
            sum += it
        }

        return sum
    }
}
