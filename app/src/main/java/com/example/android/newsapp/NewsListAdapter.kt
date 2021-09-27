package com.example.android.newsapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsListAdapter (private val items : ArrayList<String>, private val listener : NewsItemClicked) : RecyclerView.Adapter<NewsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        val holder = NewsHolder(view)
        view.setOnClickListener{
            listener.onItemClicked(items[holder.adapterPosition])
        }
        return holder
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        val currentItem = items[position]
        holder.titleView.text = currentItem
    }

    override fun getItemCount(): Int {
        return items.size
    }


}

class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleView : TextView = itemView.findViewById(R.id.title)

}

interface NewsItemClicked {
    fun onItemClicked(item : String)
}