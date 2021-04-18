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
        val adapter: ArrayAdapter<SizePizza> = ArrayAdapter<SizePizza>(
            this,
            R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        this.spinner.setAdapter(adapter);
        //this.spinner.onItemSelectedListener(new Adapter)



//        var intent= Intent(this,SecondActivity::class.java)
  //      val text:String = intent.getStringExtra("detail").toString()

        val intent = getIntent();
        val text = intent.getStringExtra("name")
        val pricePizza = intent.getIntExtra("price", 0)
        val detailPizza = intent.getStringExtra("detail")
        val imageURL = intent.getIntExtra("imageURL", 0)


      //  Toast.makeText(this, text, Toast.LENGTH_LONG).show()
        name.text = text
        price.text = pricePizza.toString()+" грн"
        detail.text = detailPizza
        imageView.setImageResource(imageURL)




    }

}