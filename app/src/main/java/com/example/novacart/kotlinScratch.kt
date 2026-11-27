package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val numbers = mutableListOf(10, 20, 30, 40, 50, 60)

    val result = numbers.shuffle()
    numbers.add(75)
    println(result)

    val products = mutableListOf(
        "Laptop",
        "Mouse",
        "Keyboard",
        "Monitor",
        "Webcam"
    )

    val result2 = products.shuffle()
    println(result2)

    val prices = listOf(10, 20, 45, 28, 55, 76, 110, 200, 300)

    val result3 = prices.shuffled()
    println(result3)

}

