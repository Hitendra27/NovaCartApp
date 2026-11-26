package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val numbers = listOf(5, 10, 15, 20)

    val result = numbers.runningFold(0) { acc, number ->
        acc + number
    }

    println(result)

    val prices = listOf(20, 35, 15, 50)

    val result2 = prices.runningFold(0) { acc, number ->
        acc + number
    }

    println(result2)

}