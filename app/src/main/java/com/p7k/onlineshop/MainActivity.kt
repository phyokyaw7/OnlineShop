package com.p7k.onlineshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.p7k.onlineshop.Adaptor.ProductAdapter
import com.p7k.onlineshop.model.Product
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var productArray =  ArrayList<Product>()
        productArray.add(Product(R.drawable.shoe1,"001","Adidas","xmas","$100"))
        productArray.add(Product(R.drawable.shoe2,"002","Adidas","soccer","$150"))
        productArray.add(Product(R.drawable.shoe3,"003","Adidas","sport","$200"))
        productArray.add(Product(R.drawable.shoe4,"004","Adidas","runner","$160"))
        productArray.add(Product(R.drawable.shoe5,"005","Adidas","walker","$50"))
        productArray.add(Product(R.drawable.shoe6,"006","Adidas","smooth","$60"))
        var productAdapter =  ProductAdapter(productArray)

        recyclerview.layoutManager =  GridLayoutManager(this,2)
        recyclerview.adapter = productAdapter
    }
}