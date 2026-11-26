package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val products = listOf(
        "Laptop",
        "Mouse",
        "Keyboard",
        "Headphones",
        "Monitor",
        "Webcam"
    )

    val result = products.chunked(3)
    println(result)

    val numbers = listOf(10, 20, 30, 40, 50, 60)

    val result2 = numbers.chunked(2) { group ->
        group.sum()
    }

    println(result2)

    val productList = listOf(
        "Laptop",
        "Macbook",
        "PS5",
        "Keyboard",
        "TV",
        "Smartphone",
        "Toaster",
        "Microwave"
    )

    val result3 = productList.chunked(4)
    println(result3)
    println(result3.size)

}
