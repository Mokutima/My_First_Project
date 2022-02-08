package com.example.firstproject

fun main(args: Array<String>) {

    var age = arrayOf(1,2,3)

    println("First element of the Array is = " + age[0])
    println("Second element of the Array is = " + age[1])
    println("Third element of the Array is = " + age[2])

    var cars = arrayOf("Maserati","Hyundai","Honda")

    println("-----------------------------------------")

    println("First element of the Array is = " + cars[0])
    println("Second element of the Array is = " + cars[1])
    println("Third element of the Array is = " + cars[2])

    cars.set(1,"Prado")

    println("-----------------------------------------")

    println("First element of the Array is = " + cars[0])
    println("Second element of the Array is = " + cars[1])
    println("Third element of the Array is = " + cars[2])

    println("Size of cars array = " + cars.size)

    var carsAndAge = arrayOf("Maserati",16,"Prado",20)

    println("-----------------------------------------")

    println("First element of the Array is = " + carsAndAge[0])
    println("Second element of the Array is = " + carsAndAge[1])
    println("Third element of the Array is = " + carsAndAge[2])
    println("Fourth element of the Array is = " + carsAndAge[3])







}