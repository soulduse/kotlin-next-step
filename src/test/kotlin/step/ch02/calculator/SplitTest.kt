package step.ch02.calculator

import org.junit.Assert.*
import org.junit.Test


/** * Created by developerkhy@gmail.com on 2017. 12. 28.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse */
class SplitTest {

    @Test
    fun split(){
        var values = "1".split(",")
        assertArrayEquals(arrayOf("1"), values.toTypedArray())

        values = "1,2".split(",")
        assertArrayEquals(arrayOf("1","2"), values.toTypedArray())
    }
}