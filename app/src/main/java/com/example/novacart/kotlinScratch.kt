package com.example.novacart

import com.example.novacart.products

fun main() {
    println(products[0].name)
    println(products[1].name)
    println(products[2].name)

    for (product in products) {
        println(product.name)
        println(product.price)
    }
}