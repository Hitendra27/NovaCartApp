package com.example.novacart

import com.example.novacart.products

fun main() {

    val expensiveProducts = mutableProducts.filter { product ->
        product.price.removePrefix("£").toDouble() > 100
    }

    for (product in expensiveProducts) {
        println("${product.name}: ${product.price}")
    }
}