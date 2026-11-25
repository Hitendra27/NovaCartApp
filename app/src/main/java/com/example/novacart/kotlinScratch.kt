package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val numbers = listOf(10, 20, 30, 40)

    val result = numbers.chunked(2) { group ->
        group.sum()
    }
    println(result)
}
