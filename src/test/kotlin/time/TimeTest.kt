package time

import org.joda.time.DateTime
import org.junit.Test


/** * Created by developerkhy@gmail.com on 2018. 1. 4.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse */
class TimeTest {

    @Test
    fun numberTest(){
        println(60 % 60)
        println(60 / 60)
        println(120 % 60)
        println(120 / 60)

        println(15 % 60)
        val data = "dddd"
        val data2 = null

        print(data)
        print(data2)
    }


    fun print(msg: String?){
        msg?.let { println(it+" let test ") }
    }


    @Test
    fun dateTest(){
        var date = DateTime()
                .plusHours(2)
                .plusMinutes(30)
//        date = date.plusHours(2)
//        date.plusHours(2)
//        date = date.plusMinutes(30)
//        date.plusMinutes(30)

        println(date.toString("yyyy-MM-dd hh:mm:ss"))

    }

    @Test
    fun sortArray(){
        val intensity = arrayOf(
                longArrayOf(200, 0),
                longArrayOf(95, 5, 95, 5),
                longArrayOf(60, 7, 60, 7, 60, 7),
                longArrayOf(43, 7, 43, 7, 43, 7, 43, 7),
                longArrayOf(32, 8, 32, 8, 32, 8, 32, 8, 32, 8),
                longArrayOf(25, 8, 25, 8, 25, 8, 25, 8, 25, 8, 25, 8),
                longArrayOf(20, 9, 20, 9, 20, 9, 20, 9, 20, 9, 20, 9, 20, 9),
                longArrayOf(16, 9, 16, 9, 16, 9, 16, 9, 16, 9, 16, 9, 16, 9, 16, 9),
                longArrayOf(13, 9, 13, 9, 13, 9, 13, 9, 13, 9, 13, 9, 13, 9, 13, 9, 13, 9),
                longArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18),
                longArrayOf(9, 16, 9, 16, 9, 16, 9, 16, 9, 16, 9, 16, 9, 16, 9, 16),
                longArrayOf(9, 20, 9, 20, 9, 20, 9, 20, 9, 20, 9, 20, 9, 20),
                longArrayOf(8, 25, 8, 25, 8, 25, 8, 25, 8, 25, 8, 25),
                longArrayOf(8, 32, 8, 32, 8, 32, 8, 32, 8, 32),
                longArrayOf(7, 43, 7, 43, 7, 43, 7, 43),
                longArrayOf(7, 60, 7, 60, 7, 60),
                longArrayOf(5, 90, 5, 90),
                longArrayOf(0, 200)
        )

        val longestItem = intensity.sortedBy { it.size }.reversed().first()

        longestItem.forEachIndexed { index, l ->
            print( l)
            print(", ")

        }
    }
}