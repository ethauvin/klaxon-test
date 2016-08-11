package com.example

import com.beust.klaxon.*

fun parse(name: String) : Any {
    val cls = javaClass<Parser>()
    val inputStream = cls.getResourceAsStream(name)!!
    return Parser().parse(inputStream)!!
}

fun main(args: Array<String>) {
    val obj = parse("test..json") as JsonObject    
} 
