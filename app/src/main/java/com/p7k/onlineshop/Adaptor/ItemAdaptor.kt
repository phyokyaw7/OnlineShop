package com.p7k.onlineshop.Adaptor

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.p7k.onlineshop.R
import com.p7k.onlineshop.model.Product
import kotlinx.android.synthetic.main.item_list.view.*

class ProductAdapter(var productlist: ArrayList<Product> ): RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    inner class ProductViewHolder (var view : View) : RecyclerView.ViewHolder(view){

        fun bindProduct (product: Product){
            view.image.setImageResource(product.image)
            view.itemNum.text = product.itemNum.toString()
            view.itemModel.text=product.itemModel
            view.itemName.text=product.itemName
            view.textPrice.text=product.itemPrice
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {

        var myview = LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ProductViewHolder(myview)
    }

    override fun getItemCount(): Int {
        return  productlist.size
    }
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bindProduct(productlist.get(position))
    }
}