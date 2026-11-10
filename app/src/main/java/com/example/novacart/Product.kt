package com.example.novacart

data class Product(
    val name: String,
    val price: String,
    val image: Int,
    val category: String
)

val laptop = Product(
    name = "Laptop",
    price = "£750",
    image = R.drawable.laptop,
    category = "Electronics"
)

val headphones = Product(
    name = "Headphones",
    price = "£120",
    image = R.drawable.headphones,
    category = "Electronics"
)

val keyboard = Product(
    name = "Keyboard",
    price = "£60",
    image = R.drawable.keyboard,
    category = "Accessories"
)

val mouse = Product(
    name = "Mouse",
    price = "£35",
    image = R.drawable.mouse,
    category = "Accessories"
)

val products = listOf(
    laptop,
    headphones,
    keyboard
)

val mutableProducts = mutableListOf(
    laptop,
    headphones,
    keyboard,
    mouse
)