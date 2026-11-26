package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val products = listOf(
        "Laptop",
        "Mouse",
        "Keyboard",
        "Monitor",
        "Webcam",
        "Headphones"
    )

    val result = products.drop(2)
    println(result)

    val result2 = products.dropLast(3)
    println(result2)

}
