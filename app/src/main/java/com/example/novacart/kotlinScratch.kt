package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val names = listOf("Laptop", "Mouse", "Keyboard")
    val prices = listOf(750, 35)

    val products = names.zip(prices)

    products.forEach { (name, price) ->
        println("$name costs £$price")
    }
}
