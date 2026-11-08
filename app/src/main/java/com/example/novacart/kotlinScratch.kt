package com.example.novacart

import com.example.novacart.products

fun main() {

    val affordableProducts = mutableProducts.filter { product ->
    product.price.removePrefix("£").toDouble() < 100
}

for (product in affordableProducts) {
    println("${product.name} ${product.price}")
}
}

