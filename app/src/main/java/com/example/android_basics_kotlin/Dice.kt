package com.example.android_basics_kotlin

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}