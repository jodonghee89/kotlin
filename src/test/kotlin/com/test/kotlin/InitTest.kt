package com.test.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InitTest {

    @Test
    fun init() {
        var a:Int? = null
        a = 3

        val intAry = intArrayOf(1,2,3,4,5)
        val intAry2 = arrayOf(1,2,3,4,5)
        val intAryInNull = arrayOfNulls<Int>(5)

        var stringAry = arrayOf("abc", "bcd", "cdf")
        stringAry += "dfe"

        assertThat(a == 3).isEqualTo(true)
        assertThat(intAry.size == intAry2.size).isEqualTo(true)
        assertThat(intAry).isNotEqualTo(intAry2)
        assertThat(intAry[0]).isEqualTo(1)
        assertThat(stringAry.size == 3).isEqualTo(false)
        assertThat(stringAry.size).isEqualTo(4)

        assertThat("${intAry[0]}").isEqualTo("1")
        assertThat(intAryInNull[2]).isEqualTo(null)
    }
}