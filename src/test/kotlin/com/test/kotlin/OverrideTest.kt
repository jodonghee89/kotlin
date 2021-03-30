package com.test.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class OverrideTest {

    @Test
    fun overriding() {
        assertThat(Animal2().eat()).isEqualTo("밥")
        assertThat(Cat().eat()).isEqualTo("사료")
    }

    @Test
    fun abstract() {
        val rabbit = Rabbit()
        val dog = Dog()
        assertThat(rabbit.sniff()).isEqualTo("흣흣")
        assertThat(dog.sniff()).isEqualTo("킁킁")
    }
}

open class Animal2 {
    companion object Log

    open fun eat() : String {
        val text = "밥"
        log.info(text)
        return text
    }
}

class Cat : Animal2() {
    override fun eat() : String {
        val text = "사료"
        log.info(text)
        return text
    }
}

abstract class Animal3 {
    companion object Log

    abstract fun eat()
    open fun sniff() : String = "킁킁"
}

class Rabbit : Animal3() {
    override fun eat() {
        log.info("토끼는 밥 먹는중")
    }

    override fun sniff(): String {
        return "흣흣"
    }
}

class Dog : Animal3() {
    override fun eat() {
        log.info("개는 식사 중")
    }
}