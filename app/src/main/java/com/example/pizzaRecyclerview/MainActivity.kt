package com.example.pizzaRecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.personrecyclerview.R.layout
import com.example.pizzaRecyclerview.data.PizzaListAdapter
import com.example.pizzaRecyclerview.model.Pizza
import com.example.pizzaRecyclerview.model.snacks
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    private var adapter: PizzaListAdapter? = null
    private var pizzaList : List<Pizza>? = null
    private var layoutManager : RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        pizzaList = snacks
        layoutManager = LinearLayoutManager(this)
        adapter = PizzaListAdapter(pizzaList!!, this)


        // setup list RecyclerView
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        // load data

        adapter!!.notifyDataSetChanged()






    }
}