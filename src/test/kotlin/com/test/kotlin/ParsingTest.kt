package com.test.kotlin

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class ParsingTest {

    @Test
    fun parse() {
        val a = 1
        val b = 10L
        assertThat(a.toLong() == b).isEqualTo(false)
    }
}