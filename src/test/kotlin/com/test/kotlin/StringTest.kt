package com.test.kotlin

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.NullPointerException

class StringTest {

    @Test
    fun String() {
        var nullString: String? = null
        assertThat(nullString?.substring(3)).isEqualTo(null)
        assertThat(nullString?:"default").isEqualTo("default")

        /* npe */
        assertThat(nullString!!.substring(3)).isInstanceOf(NullPointerException::class.java)
    }
}