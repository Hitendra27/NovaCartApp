package com.example.novacart

import com.example.novacart.products

fun main() {

    val productCount1 = mutableProducts.count {
        it.price.removePrefix("£").toDouble() < 100
    }

    val productCount2 = mutableProducts.count {
        it.price.removePrefix("£").toDouble() >=50
                && it.price.removePrefix("£").toDouble() <= 200
    }

    val productCount3 = mutableProducts.count {
        it.name.contains("o", ignoreCase = true)
    }

    println(productCount1)
    println(productCount2)
    println(productCount3)
}

