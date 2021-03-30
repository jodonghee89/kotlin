package com.test.kotlin

import org.junit.jupiter.api.Test


class ExtendsTest {

    @Test
    fun extends() {
        val animal = Animal("tiger", 14, "호랑이")
        val tiger = Tiger("tiger", 13)

        animal.intro()
        tiger.intro()
        tiger.show()
    }
}

open class Animal(val name: String, val age: Int, val type: String) {
    companion object Log

    fun intro() {
        log.info("${this.name}, ${this.age}, ${this.type}")
    }
}

class Tiger(name: String, age: Int) : Animal(name, age, "호랑이") {
    companion object Log

    fun show() {
        log.info("${this.type} 가 나타났습니다")
    }
}
