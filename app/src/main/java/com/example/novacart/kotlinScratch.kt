package com.example.novacart

import com.example.novacart.products

fun main() {

    val sortedProducts = mutableProducts
        .sortedBy { it ->
            it.price.removePrefix("£").toDouble()
        }

    for (product in sortedProducts) {
        println("${product.name}: ${product.price}")
    }
}

