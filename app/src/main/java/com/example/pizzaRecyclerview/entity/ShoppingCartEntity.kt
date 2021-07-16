package com.example.pizzaRecyclerview.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity (tableName = "shopping_cart")
data class ShoppingCartEntity (
    @PrimaryKey
    val id: Int,
    val name: String,
    val quantity:Int,
    val price: Int
    )