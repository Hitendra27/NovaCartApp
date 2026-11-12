package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val customer1 = listOf("Laptop", "Mouse")
    val customer2 = listOf("Keyboard", "Headphones")

    val customerProducts = listOf(
        customer1,
        customer2
    )

    println(customerProducts)

}
