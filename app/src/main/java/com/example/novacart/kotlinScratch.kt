package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val productNames = listOf("Laptop", "Headphones", "Keyboard", "Mouse")
    val productPrices = listOf(750, 120, 60, 35)

    val result = productNames.zip(productPrices)

    result.forEach { (name, price) ->
        println("$name costs £$price")
    }

    val employees = listOf("John", "Sarah", "David", "Emma")
    val salaries = listOf(3000, 3500, 2800, 4000)

    val result2 = employees.zip(salaries)

    val totalSalary = result2.fold(0) { acc, employee ->
        acc + employee.second
    }

    println("The Total Salary is $totalSalary")
}
