package com.test.kotlin

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StringJoinTest {

    @Test
    fun stringJoin() {
        val text = "test.kotlin.com"
        text.isNullOrBlank()
        println(text.substring(5, 10))
        println(text.substring(5..10))

        val split = text.split(Regex("\\."))

        assertThat(split.size).isEqualTo(3)
        assertThat(join(split, "")).isEqualTo("[testkotlincom]")
        assertThat(join(listOf("kei", "super", "zzang"), "-")).isEqualTo("[kei-super-zzang]")
    }

    private fun join(ary: List<String>, separator: String) = ary.joinToString(separator, "[", "]")
}