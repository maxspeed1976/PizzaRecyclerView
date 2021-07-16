package com.example.pizzaRecyclerview

import androidx.annotation.WorkerThread
import com.example.pizzaRecyclerview.Dao.ShoppingCartDAO
import kotlinx.coroutines.flow.Flow

class ShoppingCartRepository (private val shopDao: ShoppingCartDAO){
    // Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO


        // Room executes all queries on a separate thread.
        // Observed Flow will notify the observer when the data has changed.
        val allShoppingCart: Flow<List<ShoppingCart>> = shopDao.getAll()

        // By default Room runs suspend queries off the main thread, therefore, we don't need to
        // implement anything else to ensure we're not doing long running database work
        // off the main thread.
        @Suppress("RedundantSuspendModifier")
        @WorkerThread
        suspend fun insert(shopcart: ShoppingCart) {
            shopDao.insertAll(shopcart)
        }

        @WorkerThread
        suspend fun  deleteAll(){
            shopDao.deleteAll()

        }
    }
