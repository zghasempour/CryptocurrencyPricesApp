package com.example.cryptocurrencypricesapp.market

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptocurrencypricesapp.R
import com.example.cryptocurrencypricesapp.TextItemViewHolder
import com.example.cryptocurrencypricesapp.network.Coin


class CryptoAdapter: RecyclerView.Adapter<TextItemViewHolder>() {
    var data = listOf<Coin>()
    set(value){
        field = value
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.text_item_view,parent, false) as TextView
        return TextItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: TextItemViewHolder, position: Int) {
        val item = data[position]
        holder.textView.text = item.name
    }

    override fun getItemCount() = data.size
}