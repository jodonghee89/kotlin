package com.test.kotlin

import org.junit.jupiter.api.Test

class ListTest {

    @Test
    fun list() {
        val list = listOf("1", "2", "3")

        /* error */
//        list[3] = "4"
//        list += "5"

        val mutableList = mutableListOf("1", "2", "3")
        mutableList += "4"
    }
}