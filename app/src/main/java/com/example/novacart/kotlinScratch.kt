package com.example.novacart

import com.example.novacart.products

fun main() {

    val productPrices = mutableProducts.map { it ->
        it.price
    }

    println(productPrices)
}

