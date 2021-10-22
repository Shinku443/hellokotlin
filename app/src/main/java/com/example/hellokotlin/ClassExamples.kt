package com.example.hellokotlin

class ClassExamples {

    //Example class
    class Customer
    class Contact(val id: Int, var email: String) //id cannot be edited, email can be
}

class MutableStack<E>(vararg items: E){
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek():E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MUtableStack(${elements.joinToString() }}"
}
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main(){
    val customer = ClassExamples.Customer()
    val contact = ClassExamples.Contact(1, "test@gmail.com")

    println(contact.id)
    println(contact.email)
    contact.email = "newemail@gmail.com"
    //contact.id = 2
    println(contact.id)
    println(contact.email)

    val stack = mutableStackOf(0.62, 3.14, 2.7) //infers type (no need for mutableStackOf<Double>
    println(stack)
}