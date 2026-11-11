package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val totalValue = mutableProducts.fold(0.0) { accumilator, product ->
        accumilator + product.price.removePrefix("£").toDouble()
    }

    println("Total: £$totalValue")

    val affordableTotal = mutableProducts
        .filter { it. }

}
