package com.example.hellokotlin

class Inheritance {

    open class Dog { //open allows for inheritance - otherwise its 'final'
        open fun sayHello() {
            println("dog dog")
        }
    }

    class Yorkshire : Dog(){
        override fun sayHello() {
            println("york york")
        }
    }
}

fun main(){
    val dog: Inheritance.Dog = Inheritance.Yorkshire()
    dog.sayHello()
}