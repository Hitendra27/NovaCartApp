package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val numbers = listOf(10, 20, 30, 40, 50)

    val result = numbers.windowed(
        size = 3,
        step = 2
    )

    println(result)

}
