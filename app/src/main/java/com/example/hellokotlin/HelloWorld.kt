package com.example.hellokotlin

//Get Familiar with Kotlin
//Function declaration - method name - (variable to be used name - :Type): return Type (leave blank or use Unit for void)
fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int): Int {
    return x * y
}


fun main() {
    println("Hello, World!")
    printMessage("lol test")
    printMessageWithPrefix("message");
    printMessageWithPrefix("message", "prefix is changed");
    println(sum(4, 5))
    println(multiply(2, 3))
    /*val read = Scanner(System.`in`)
    println("Enter an integer to sum: ")
    val num1 = read.nextInt()
    println("Enter another integer to sum: ")
    val num2 = read.nextInt()
    println("Summation: " + sum(num1, num2))*/
    val testInflixExamples = InflixExamples()
    testInflixExamples.runMethods()
    val testOperatorFunctions = OperatorFunctions()
    testOperatorFunctions.runMethods()
    val testVarArgFunctions = VarargFunctions()
    testVarArgFunctions.runMethods()
    val testVariableExamples = VariableExamples()
    testVariableExamples.runMethods()
}