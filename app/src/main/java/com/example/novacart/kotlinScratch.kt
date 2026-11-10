package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val productsByName = mutableProducts.associateBy {
        it.name
    }

    println(productsByName)

    val productsByCategory = mutableProducts.associateBy {
        it.category
    }

    println(productsByCategory)

    val productName = productsByName.map {
        it.key
    }

    println(productName[0])

}
