package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val productsByCategory = mutableProducts.groupBy {
        it.category
    }

    println(productsByCategory)

}
