package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val numbers = listOf(10, 20, 30, 40, 50, 60)

    val result = numbers.filterNot { it <= 50 }
    println(result)

    val products = listOf(
        "Laptop",
        "Mouse",
        "Keyboard",
        "Monitor",
        "Webcam"
    )

    val result2 = products.filterNot { it.startsWith("M") }
    println(result2)

    val prices = listOf(10, 20, 45, 28, 55, 76, 110, 200, 300)

    val result3 = prices.filterNot { it >= 100 }
    println(result3)

}

