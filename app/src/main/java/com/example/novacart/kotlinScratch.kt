package com.example.novacart

import com.example.novacart.products

fun main() {

    mutableProducts.forEach {
        if (it.price.removePrefix("£").toDouble() > 100) {
            println("${it.name}: ${it.price}")
        }
    }
}
