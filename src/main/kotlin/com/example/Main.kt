package com.example

import com.beust.klaxon.*
import java.io.*

fun parse(name: String) : Any {
    val cls = Parser::class.java
    // val inputStream = cls.getResourceAsStream(name)!!
    val inputStream = FileInputStream(name)
    return Parser().parse(inputStream)!!
}

fun main(args: Array<String>) {
    val obj = parse("test.json") as JsonObject
    println(obj)
} 
