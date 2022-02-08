package com.example.firstproject

fun main(args: Array<String>) {

    var age = ArrayList<Int>()

    age.add(24)
    age.add(1,14)
    age.add(40)

    /*println("First element of ArrayList = " + age[0])
    println("Second element of ArrayList = " + age[1])
    println("Third element of ArrayList = ${age[2]}")

     */

    /*age.remove(14)
    println(age.size)
    println("First element of ArrayList = " + age[0])
    println("Second element of ArrayList = " + age[1])

     */

    var cars = arrayListOf<String>("Opel","Mercedes")

    cars.add("Prado")

    println("First element of ArrayList = " + cars[0])
    println("Second element of ArrayList = " + cars[1])
    println("Third element of ArrayList = ${cars[2]}")

}