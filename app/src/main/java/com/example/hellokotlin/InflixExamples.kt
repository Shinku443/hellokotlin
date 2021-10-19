package com.example.hellokotlin

class InflixExamples {
    fun runMethods(){
        println(2 times "Test")
        val pair = "Ferrari" to "Katrina"
        println(pair)
        val myPair = "McLaren" onto "Lucas"
        println(myPair)
        val sophia = Person("Sophia")
        val claudia = Person("Claudia")
        sophia likes claudia
    }

    infix fun Int.times(str: String) = str.repeat(this)

    infix fun String.onto(other: String) = Pair(this, other) //own implementation of "to"


    class Person(val name: String){
        val likedPeople = mutableListOf<Person>()
        infix fun likes(other: Person) {likedPeople.add(other)}
    }
}