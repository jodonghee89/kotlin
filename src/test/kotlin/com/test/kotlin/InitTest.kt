package com.test.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.slf4j.Logger
import org.slf4j.LoggerFactory

val log: Logger = LoggerFactory.getLogger("com.test.kotlin")

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

        Person("superman", 15)
        Person("goodman", 20)
        Person("zzangman")
    }
}

class Person(var name: String, var age: Int) {
    init {
        print()
    }

    constructor(name: String) : this(name, 30) {
        log.info("보조 생성자 수행 여부?")
        print()
    }

    fun print() {
        this.name += " 님"
        log.info("${this.name} 의 나이는 ${this.age} 입니다")
    }
}