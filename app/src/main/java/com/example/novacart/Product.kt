package com.example.novacart

data class Product(
    val name: String,
    val price: String,
    val image: Int
)

val laptop = Product(
    name = "Laptop",
    price = "750",
    image = R.drawable.laptop
)

val headphones = Product(
    name = "Headphones",
    price = "120",
    image = R.drawable.headphones
)