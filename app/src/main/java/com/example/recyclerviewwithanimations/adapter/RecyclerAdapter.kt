package com.example.recyclerviewwithanimations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithanimations.R
import com.example.recyclerviewwithanimations.model.NewsModel
import kotlinx.android.synthetic.main.animated_item.view.*
import kotlin.collections.ArrayList

class RecyclerAdapter(var context: Context, var newsList: ArrayList<NewsModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animated_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = newsList[position]
        holder.itemView.imageView.animation = AnimationUtils.loadAnimation(context,R.anim.fade_transition_animation)
        holder.itemView.constraintLayout.animation = AnimationUtils.loadAnimation(context,R.anim.fade_scale_animation)
        holder.itemView.txt_title.text = item.title
        holder.itemView.txt_date.text = item.date
        holder.itemView.txt_desc.text = item.description
        holder.itemView.txt_title.text = item.title
        holder.itemView.imageView.setImageResource(item.image)
    }

    override fun getItemCount() = newsList.size
}