package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val affordableProducts = mutableProducts.filter {
        it.price.removePrefix("£").toDouble() < 200
    }

    val productLower = affordableProducts.map {
        it.name.lowercase()
    }

    productLower.forEach {
        println(it)
    }

    val result = affordableProducts.map {
        it.price.removePrefix("£").toDouble()
    }

    result.forEach {
        println(it)
    }
}
