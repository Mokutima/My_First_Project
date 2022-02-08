package com.example.firstproject

fun main(args: Array<String>) {

    //immutable

    println("----------immutable map of------------")
    var age = mapOf<String,Int>("Mokutima" to 20, "Ubokobong" to 31)

    println("Age of Mokutima : " + age["Mokutima"])
    println("Age of Ubokobong : " + age["Ubokobong"])

    //mutable

    var mutableAge = mutableMapOf<String,Int>("Mokutima" to 20, "Ubokobong" to 31)

    mutableAge.put("Sushi",145)


    println("------------mutable map of------------")
    println("Age of Mokutima : " + age["Mokutima"])
    println("Age of Ubokobong : " + age["Ubokobong"])
    println("Age of Sushi : " + mutableAge["Sushi"])

}