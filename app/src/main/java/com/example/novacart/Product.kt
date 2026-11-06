package com.example.novacart

data class Product(
    val name: String,
    val price: String,
    val image: Int
)

val laptop = Product(
    name = "Laptop",
    price = "£750",
    image = R.drawable.laptop
)

val headphones = Product(
    name = "Headphones",
    price = "£120",
    image = R.drawable.headphones
)

val keyboard = Product(
    name = "Keyboard",
    price = "£60",
    image = R.drawable.keyboard
)

val mouse = Product(
    name = "Mouse",
    price = "£35",
    image = R.drawable.mouse
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