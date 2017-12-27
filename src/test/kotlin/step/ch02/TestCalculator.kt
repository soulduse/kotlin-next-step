package com.next.step.ch02

import org.junit.After
import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

/** * Created by developerkhy@gmail.com on 2017. 12. 27.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse */ 
class TestCalculator{
    private var cal : Calculator ?= null

    @Before
    fun setup(){
        cal = Calculator()
        println("Before")
    }

    @Test
    fun add(){
        assertEquals(9, cal?.add(6,3))
        println("add")
    }

    @Test
    fun subtract(){
        assertEquals(9, cal?.subtract(12,3))
        println("subtract")
    }

    @After
    fun teardown(){
        println("teardown")
    }
}
