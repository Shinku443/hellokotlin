package com.example.hellokotlin

class VariableExamples {
    fun runMethods() {
        //--------Variables---------//
        var a: String = "initial" //declares mutable variable and initializes it
        println(a)
        val b: Int = 1 //declares an immutable variable and initializes it
        val c = 3 //declares an immutable variable and initializes
        // it without specifying the type (compiler infers type)
        var e: Int //declares a variable without initialization
        //println(e) - compiler error - must be initialized
        //val cannot be reassigned - var can be
        var sum = sum(4, 5)
        println("Sumof 4 + 5 = $sum")
        sum = (sum(5, 6))
        println("Now sum of 5 + 6 = $sum") //$sum within print to reference sum as the variable
        //-------Nullable-------//
        //Variable types don't allow null assignment::if it needs to be nullable, declare it with ?
        var neverNull: String = "This can't be null"
        //neverNull = null - compilation error
        var nullable: String? = "You can keep a null here"
        nullable = null //can be assigned to null
        var inferredNonNull = "The compiler assumes non-null"
        //inferredNonNull = null - compilation error

        fun strLength(notNull: String): Int { //function called strLength - String param 'notNull' - returns Int
            return notNull.length
        }

        println(strLength(neverNull))
        println("Describing non-null string 'abc'")
        println(describeString("abc"))
        println("Describing null string")
        println(describeString(null))
        //strLength(nullable) - compilation error (null not allowed)
    }

    //Working with nulls
    fun describeString(maybeString: String?): String {              // function takes in a nullable string
        if (maybeString != null && maybeString.length > 0) {        // if string isnt null and not empty
            return "String of length ${maybeString.length}"         //return length of string
        } else {
            return "Empty or null string"                           //otherwise return msg
        }
    }
}

fun main() {
    println("wtf theres a main")
}