package com.example.novacart

import androidx.compose.foundation.rememberScrollState
import com.example.novacart.products

fun main() {

    val uniqueCategories = mutableProducts
        .distinctBy { it.category }
        .map { it.name }

    val uniqueProducts = mutableProducts
        .distinctBy { it.name }



    println(uniqueCategories)
    println(uniqueProducts)
    println(uniqueProducts.size)

}
