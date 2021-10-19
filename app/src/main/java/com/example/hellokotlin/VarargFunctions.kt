package com.example.hellokotlin

class VarargFunctions {
    fun runMethods() {
        printAll("Alison", "Van", "was", "here", "lol")
        println("\n:::Printing out prefix method with only message inputs:::")
        printAllWithPrefix("Alison", "Van", "was", "here", "lol")
        println("\n:::Printing out prefix method with prefix of Word:::")
        printAllWithPrefix("Alison", "Van", "was", "here", "lol", prefix = "Word: ")
    }

    fun printAll(vararg messages: String) {
        for (m in messages) println(m) //Iterate through messages using m, and then do println
    }

    fun printAllWithPrefix(vararg messages: String, prefix: String = "Base Prefix: ") {
        for (m in messages) println(prefix + m)
    }

    /*fun log(vararg entries: String) {
        printAll(*entries)
    }*/
}