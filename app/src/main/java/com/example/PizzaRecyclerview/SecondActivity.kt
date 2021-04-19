package com.example.PizzaRecyclerview

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.PizzaRecyclerview.model.SizePizza
import com.example.personrecyclerview.R.layout
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_second)








        val intent = getIntent();
        val text = intent.getStringExtra("name")
        val pricePizza = intent.getIntExtra("price", 0)
        val detailPizza = intent.getStringExtra("detail")
        val imageURL = intent.getIntExtra("imageURL", 0)
        val size = intent.getStringExtra("size")
        val price1 = intent.getStringExtra("price1")
        val price2 = intent.getStringExtra("price2")
        val size1 = intent.getStringExtra("size1")
        val size2 = intent.getStringExtra("size2")








      //  Toast.makeText(this, text, Toast.LENGTH_LONG).show()
        name.text = text
        price.text = pricePizza.toString()+" грн"
        detail.text = detailPizza
        radioButton_male.text = size1 +" - "+price1.toString()
        radioButton_female.text = size2 +" - "+price2.toString()
        imageView.setImageResource(imageURL)




    }

}