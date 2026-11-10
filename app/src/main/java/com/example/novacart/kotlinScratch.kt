package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val (expensiveProducts, affordableProducts) = mutableProducts
        .partition {
            it.price.removePrefix("£").toDouble() > 100
        }

    println("EXPENSIVE PRODUCTS")
    expensiveProducts.forEach {
        println("${it.name} - ${it.price}")
    }

    println()

    println("AFFORDABLE PRODUCTS")
    affordableProducts.forEach {
        println("${it.name} - ${it.price}")
    }

    val expensiveCount = expensiveProducts.size
    val affordableCount = affordableProducts.size

    println("The Expensive Product count is $expensiveCount")
    println("The Affordable Product count is $affordableCount")

}
