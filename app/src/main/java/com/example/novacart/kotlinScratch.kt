package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val electronics = listOf("Laptop", "Headphones")
    val accessories = listOf("Keyboard", "Mouse")

    val allCategories = listOf(
        electronics,
        accessories
    )

    val result = allCategories.flatMap { it }
    println(result)

    val result2 = allCategories.map { it }
    println(result2)

    val phones = listOf("iPhone", "Samsung")
    val computers = listOf("Laptop", "Desktop")
    val accessories1 = listOf("Mouse", "Keyboard")

    val allCategories1 = listOf(
        phones,
        computers,
        accessories1
    )

    val result3 = allCategories1.flatMap { it }
    println(result3)

    val totalCount = result3.count()
    println("Total Product Count: $totalCount")

}
