package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val totalValue = mutableProducts.fold(0.0) { accumilator, product ->
        accumilator + product.price.removePrefix("£").toDouble()
    }

    println("Total: £$totalValue")

    val affordableTotal = mutableProducts
        .filter { it.price.removePrefix("£").toDouble() < 200 }
        .fold(0.0) { accumilator, product ->
            accumilator + product.price.removePrefix("£").toDouble()
        }

    println("Total for products under £200: £$affordableTotal")

    val productCount = mutableProducts.fold(0) { acc, prouduct ->
         acc + 1
    }

    println("Number of products: $productCount")

}
