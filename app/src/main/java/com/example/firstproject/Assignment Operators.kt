package com.example.firstproject

fun main(args: Array<String>) {
    var a:Int = 20
    var b:Int = 12
    var c:Int = 0

    c = a + b

    println("c = a + b = " + c)

    c +=a // c = c + a

    println("c +=a = " + c)

    c -=a // c = c - a

    println("c -=a = " + c)

    c *=a // c = c * a

    println("c *=a = " + c)

    c /=a // c = c / a

    println("c /=a = " + c)

    c %=a // c = c % a

    println("c %=a = " + c)
}