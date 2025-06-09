package com.example.tugas8ppb

data class Dog(val name: String, val age: Int, val about: String, val food: String, val imageRes: Int)

val sampleDogs = listOf(
    Dog("Koda", 2, "Eating treats on the terrace", "Chicken jerky", R.drawable.koda),
    Dog("Lola", 16, "Barking at Daddy", "Boiled chicken", R.drawable.lola),
    Dog("Frankie", 2, "Loves hiking and snow", "Beef kibble", R.drawable.frankie),
    Dog("Nox", 8, "Sleeping in the sun", "Salmon bites", R.drawable.nox),
    Dog("Faye", 4, "Chasing butterflies", "Tuna chunks", R.drawable.faye),
    Dog("Bear", 3, "Loves belly rubs and naps", "Peanut butter treats", R.drawable.bear),
    Dog("Bella", 5, "Protects the garden like a queen", "Lamb stew", R.drawable.bella),
    Dog("Charlie", 6, "Fetch expert and pro cuddler", "Cheese sticks", R.drawable.charlie),
    Dog("Max", 7, "Walks himself and brings the leash", "Duck strips", R.drawable.max),
    Dog("Daisy", 1, "Zooms all over the house", "Carrot snacks", R.drawable.daisy),
)
