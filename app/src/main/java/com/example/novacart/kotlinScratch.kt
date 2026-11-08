package com.example.novacart

import com.example.novacart.products

fun main() {

    val affordableProductNames = mutableProducts
        .filter {it ->
            it.price.removePrefix("£").toDouble() < 100
        }
        .map { it.name.lowercase() }

    println(affordableProductNames)
}

