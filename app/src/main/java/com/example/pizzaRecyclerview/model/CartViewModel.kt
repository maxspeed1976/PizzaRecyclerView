/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.pizzaRecyclerview.model

import androidx.lifecycle.ViewModel
import com.example.pizzaRecyclerview.CartItem
import com.example.pizzaRecyclerview.ShoppingCart
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * Holds the contents of the cart and allows changes to it.
 *
 * TODO: Move data to Repository so it can be displayed and changed consistently throughout the app.
 */
class CartViewModel : ViewModel() {
    private val _orderLines: MutableStateFlow<List<CartItem>> =
        MutableStateFlow(ShoppingCart.getCart())
    val orderLines: StateFlow<List<CartItem>> get() = _orderLines

    fun removeItem(id: Int) {

        _orderLines.value = _orderLines.value.filter { it.pizza.id != id }
    }

    fun increaseItemCount(id: Int) {
        val currentCount = _orderLines.value.first { it.pizza.id == id }.quantity
        updateSnackCount(id, currentCount + 1)
    }

    fun decreaseItemCount(id: Int) {
        val currentCount = _orderLines.value.first { it.pizza.id == id }.quantity
        if (currentCount == 1) {
            // remove snack from cart
            removeItem(id)
        } else {
            // update quantity in cart
            updateSnackCount(id, currentCount - 1)
        }
    }

    private fun updateSnackCount(id: Int, quantity: Int) {
        _orderLines.value = _orderLines.value.map {
            if (it.pizza.id == id) {
                it.copy(quantity = quantity)
            } else {
                it
            }
        }
    }
}
