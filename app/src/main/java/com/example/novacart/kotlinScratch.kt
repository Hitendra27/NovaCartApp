package com.example.novacart

import com.example.novacart.products

fun main() {

    val affordableProducts = mutableProducts
        .sortedBy { it -> it.price }
        .filter { it ->
            it.price.removePrefix("£").toDouble() < 200 }
        .map { it -> it.name.uppercase() }

    for (product in affordableProducts) {
        println("${product}: ${product.price}")
    }

}

