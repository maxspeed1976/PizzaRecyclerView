package com.example.pizzaRecyclerview.Dao

import androidx.room.*
import com.example.pizzaRecyclerview.ShoppingCart
import kotlinx.coroutines.flow.Flow

@Dao
interface ShoppingCartDAO {
    @Query("SELECT * FROM shopping_cart ORDER BY name ASC")
    fun getAll(): Flow<List<ShoppingCart>>

    @Insert
    fun insertAll(vararg shopcart: ShoppingCart)

    @Delete
    fun deleteAll()



}