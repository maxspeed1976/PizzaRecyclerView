package com.example.PizzaRecyclerview.data

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.PizzaRecyclerview.data.PizzaListAdapter.ViewHolder
import com.example.personrecyclerview.R
import com.example.PizzaRecyclerview.model.Pizza

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
                Toast.makeText(context, name.text, Toast.LENGTH_LONG).show()

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