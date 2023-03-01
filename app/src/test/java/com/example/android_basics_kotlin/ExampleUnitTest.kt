package com.example.android_basics_kotlin

import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun generates_number(){
        val dice = Dice(6)
        val diceRoll = dice.roll()
        assertTrue("The value of rollResult was not between 1 and 6", diceRoll in 1..6)
    }
}