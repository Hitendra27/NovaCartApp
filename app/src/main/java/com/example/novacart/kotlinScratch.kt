package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val numbers = listOf(10, 20, 30, 40, 50, 60)

    val result = numbers.windowed(3)
    println(result)

    val result2 = numbers.windowed(
        size = 3,
        step = 2
    )

    println(result2)

    val temperatures = listOf(20, 22, 24, 26, 28, 30)

    val result3 = temperatures.windowed(3) { window ->
        window.average()
    }
    println(result3)

}
