package step.ch02.calculator

import com.next.step.ch02.StringCalculator
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals


/** * Created by developerkhy@gmail.com on 2017. 12. 27.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse */
class StringCalculatorTest {

    private var cal : StringCalculator?= null

    @Before
    fun setup(){
        cal = StringCalculator()
    }

    @Test
    fun add_null_또는_빈문자(){
        assertEquals(0, cal?.add(null))
        assertEquals(0, cal?.add(""))
    }

    @Test
    @Throws(Exception::class)
    fun add_숫자하나(){
        assertEquals(1, cal?.add("1"))
        assertEquals(3, cal?.add("3"))
    }

    @Test
    @Throws(Exception::class)
    fun add_쉼표구분자(){
        assertEquals(3, cal?.add("1,2"))
    }

    @Test
    @Throws(Exception::class)
    fun add_쉼표_또는_콜론_구분자(){
        assertEquals(6, cal?.add("1,2:3"))
    }

    @Test
    @Throws(Exception::class)
    fun add_custom_구분자(){
        assertEquals(6, cal?.add("//;\n1;2;3"))
    }

    @Test(expected = RuntimeException::class)
    @Throws(Exception::class)
    fun add_negative() {
        cal?.add("-1,2,3")
    }
}