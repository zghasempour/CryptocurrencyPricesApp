package com.example.cryptocurrencypricesapp.market

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.cryptocurrencypricesapp.databinding.GridViewItemBinding
import com.example.cryptocurrencypricesapp.network.Coin

class ListGridAdapter(private val onClickListener : OnClickListener ) : ListAdapter<Coin, ListGridAdapter.CoinViewHolder>(DiffCallback) {
    class CoinViewHolder(private var binding : GridViewItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(coin : Coin){
            binding.coin = coin
            binding.executePendingBindings()
        }

    }

    companion object DiffCallback : DiffUtil.ItemCallback<Coin>(){
        override fun areItemsTheSame(oldItem: Coin, newItem: Coin): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Coin, newItem: Coin): Boolean {
            return oldItem.id == newItem.id
        }

    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListGridAdapter.CoinViewHolder {
        return CoinViewHolder(GridViewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ListGridAdapter.CoinViewHolder, position: Int) {
        val coin = getItem(position)
        holder.itemView.setOnClickListener {
            onClickListener.onClick(coin)
        }
        holder.bind(coin)
    }
    class OnClickListener(val clickListener: (coin: Coin) -> Unit) {
        fun onClick(coin: Coin) = clickListener(coin)
    }
}