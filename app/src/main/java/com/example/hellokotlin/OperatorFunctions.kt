package com.example.hellokotlin

class OperatorFunctions {
<<<<<<< HEAD
=======
    fun runMethods(){
        println(2 * "Bye ")
        val str = "Always forgive your enemies; nothing annoys them so much."
        println(str[0..14])
    }

    operator fun Int.times(str: String) = str.repeat(this)
    operator fun String.get(range: IntRange) = substring(range)
>>>>>>> 6f70584 (Adds OperatorFunction examples)
}