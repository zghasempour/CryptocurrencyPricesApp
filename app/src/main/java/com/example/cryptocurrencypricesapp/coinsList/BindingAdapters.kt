package com.example.cryptocurrencypricesapp.coinsList

import android.view.View
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.cryptocurrencypricesapp.R
import com.example.cryptocurrencypricesapp.network.Coin

@BindingAdapter("listData")
fun bindRecyclerView(recyclerView: RecyclerView , data : List<Coin>?){
    val adapter = recyclerView.adapter as ListGridAdapter
    adapter.submitList(data)
}
@BindingAdapter("imageUrl")
fun bindImage (imgView : ImageView, imgUrl : String?){
    imgUrl?.let {
        val imgUri = it.toUri().buildUpon().scheme("https").build()
        Glide.with(imgView.context)
            .load(imgUri)
            .apply(RequestOptions()
            .placeholder(R.drawable.loading_animation)
            .error(R.drawable.ic_broken_image))
            .into(imgView)
    }

}

@BindingAdapter("MarketsApiStatus")fun bindStatus(statusImageView: ImageView, status: MarketsApiStatus?) {
    when (status) {
        MarketsApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        MarketsApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        MarketsApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
    }
}