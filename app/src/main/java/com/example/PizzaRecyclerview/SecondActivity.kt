package com.example.PizzaRecyclerview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.PizzaRecyclerview.model.Pizza
import com.example.personrecyclerview.R.layout
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_second)
//        var intent= Intent(this,SecondActivity::class.java)
  //      val text:String = intent.getStringExtra("detail").toString()

        val intent = getIntent();
        val text = intent.getStringExtra("name")
        val pricePizza = intent.getIntExtra("price",0)
        val detailPizza = intent.getStringExtra("detail")
        val imageURL = intent.getIntExtra("imageURL",0)


        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
        name.text = text
        price.text = pricePizza.toString()+" грн"
        detail.text = detailPizza
        imageView.setImageResource(imageURL)




    }

}