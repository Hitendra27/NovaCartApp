package com.example.novacart

import com.example.novacart.products

fun main() {

    val foundProduct = mutableProducts
        .find { it ->
            it.name == "Keyboard"
        }

    val productName = foundProduct?.name ?: "Product not found"

    println(productName)

}

