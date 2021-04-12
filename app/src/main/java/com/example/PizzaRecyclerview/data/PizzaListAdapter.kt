package com.example.PizzaRecyclerview.data

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.PizzaRecyclerview.SecondActivity
import com.example.PizzaRecyclerview.data.PizzaListAdapter.ViewHolder
import com.example.PizzaRecyclerview.model.Pizza
import com.example.personrecyclerview.R

class PizzaListAdapter(
        private val list: List<Pizza>,
        private val context: Context
): RecyclerView.Adapter<ViewHolder>() {

    inner class ViewHolder(itemView: View, context: Context): RecyclerView.ViewHolder(itemView) {

        fun bindItem(pizza: Pizza){

            var name: TextView = itemView.findViewById(R.id.name)
            var price: TextView = itemView.findViewById(R.id.age)
            var pizzaImage: ImageView = itemView.findViewById(R.id.picView)
            name.text = pizza.name
            price.text = pizza.price.toString()
            pizzaImage.setImageResource(pizza.imageUrl)

            itemView.setOnClickListener(){

                val intent = Intent(context, SecondActivity::class.java)
                intent.putExtra("name",pizza.name)
                intent.putExtra("price",pizza.price)
                intent.putExtra("detail", pizza.detail)
                intent.putExtra("imageURL", pizza.imageUrl)

                val bundle = Bundle()
                startActivity(context, intent,bundle)


            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
                //Create our view from xml file
        val view = LayoutInflater.from(context).inflate(R.layout.list_row, parent, false)
        return ViewHolder(view, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.bindItem(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }



}