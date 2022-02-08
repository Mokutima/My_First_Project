package com.example.firstproject

fun main(args: Array<String>) {

    var result:Int = 12 + 2 * 2
    println("Result = " + result)

    result = (12 + 2) * 2
    println("Result = " + result)

    var a:Int = 4
    var b:Int = 6
    var c:Int = 2
    var sum:Int = 0

    sum = a + --b + --c
    println("Sum = " + sum)
}