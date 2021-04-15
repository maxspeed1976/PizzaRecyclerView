package com.example.PizzaRecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.personrecyclerview.R.layout
import com.example.PizzaRecyclerview.data.PizzaListAdapter
import com.example.PizzaRecyclerview.model.Pizza
import com.example.PizzaRecyclerview.model.snacks
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