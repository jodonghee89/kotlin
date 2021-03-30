package com.test.kotlin

import org.junit.jupiter.api.Test

class InterFaceTest {

    @Test
    fun interfaceTest() {
        People().apply { this.run(); this.eat(); this.along("뛰어뛰어"); }
    }
}

interface Runner {
    fun run()
    fun along(text: String) = log.info(text)
}

interface Eater {
    fun eat()
}

class People : Runner, Eater {
    companion object Log

    override fun run() {
        log.info("달려달려")
    }

    override fun eat() {
        log.info("먹어먹어")
    }

    override fun along(text: String) {
        return super.along(text)
    }

}