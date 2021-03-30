package com.test.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ObjectTest {

    @Test
    fun counterTest() {
        Counter.up()
        Counter.up()

        assertThat(Counter.count).isEqualTo(2)
        Counter.clear()

        assertThat(Counter.count).isEqualTo(0)
    }

    @Test
    fun sumTest() {
        val food1 = FoodPoll("라면").apply { vote() }
        val food2 = FoodPoll("순대").apply { vote() }

        println("${food1.name} : ${food1.count}")
        println("${food2.name} : ${food2.count}")

        assertThat(food1.count).isEqualTo(1)
        assertThat(food2.count).isEqualTo(1)
        assertThat(FoodPoll.sum).isEqualTo(2)
    }
}

object Counter {
    var count = 0

    fun up() {
        count++
    }

    fun down() {
        count--
    }

    fun clear() {
        count = 0
    }
}


class FoodPoll(var name: String) {
    companion object {
        var sum = 0
    }

    var count = 0

    fun vote() {
        sum++
        count++
    }
}