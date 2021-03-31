package com.test.kotlin

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LambdaTest {
    companion object Log

    @Test
    fun lambda() {
        val c: (String) -> String = { "$it 입니다!!!" }
        assertThat(c("kei")).isEqualTo("kei 입니다!!!")
    }

    @Test
    fun scope() {

        var price = 5000

        val book = Book("kei", 15000)
        val apply = book.apply { name += " man"; price += 1500 }
        log.info("apply.price => ${apply.price}")
        assertThat(apply.price).isEqualTo(15000)

        val run = Book("kei", 3000).run { this.price += 1500; this.price }
        assertThat(run).isEqualTo(4500)

        assertThat(Book("kei", 3000).also { it.price += 1500 }.price).isEqualTo(4500)
        assertThat(Book("kei", 3000).let { it.price += 1500; it.price }).isEqualTo(4500)
    }
}

class Book(var name: String, var price: Int)