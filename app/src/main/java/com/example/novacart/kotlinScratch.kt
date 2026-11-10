package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val expensiveProducts = mutableProducts
        .filter {
        it.price.removePrefix("£").toDouble() > 50 }
        .sortedBy { it.price.removePrefix("£").toDouble() }

    val expensiveProductNames = expensiveProducts.map {
        it.name.uppercase()
    }

    val expensiveProductCount = expensiveProducts.count()

    val productReport = expensiveProducts.mapIndexed { index, product ->
        "${index + 1}. ${product.name} - ${product.price}"
    }.joinToString("\n")

    println("NOVA CART PRODUCT REPORT")
    println()
    println(productReport)
    println()
    println("Total expensive products: $expensiveProductCount")

    var total = 0.0

    expensiveProducts.forEach {
        total += it.price.removePrefix("£").toDouble()
    }

    println("Total value: $total")

}
