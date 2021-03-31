package com.test.kotlin

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GenericTest {

    @Test
    fun generic() {
        assertThat(GenericClass(Sub1()).shouting()).isEqualTo("섭1이 소리친다")
        assertThat(GenericClass(Sub2()).shouting()).isEqualTo("섭2이 소리친다")
        /* error */
//        GenericClass(Sub())
    }
}

open class Super {
    open fun shout() : String {
        return "슈퍼가 소리친다"
    }
}

class Sub1 : Super() {
    override fun shout() : String {
        return "섭1이 소리친다"
    }
}

class Sub2 : Super() {
    override fun shout() = "섭2가 소리친다"
}

open class Super1 {
    open fun shout() = "슈퍼1가 소리친다"
}

class Sub3 : Super1() {
    override fun shout() = "섭3이 소리친다"
}

class GenericClass<T: Super> (var t: T) {
    fun shouting() : String {
        return t.shout()
    }
}