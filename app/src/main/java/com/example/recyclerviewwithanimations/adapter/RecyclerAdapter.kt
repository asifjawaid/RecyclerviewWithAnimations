package com.example.recyclerviewwithanimations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewwithanimations.R
import kotlinx.android.synthetic.main.animated_item.view.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class RecyclerAdapter(/*var summaryList: ArrayList<NewsModel>*/var context: Context) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private lateinit var circleImageView: ImageView
    private lateinit var txt_title: TextView
    private lateinit var txt_desc: TextView
    private lateinit var txt_time: TextView
    private lateinit var constraintLayout: ConstraintLayout

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            circleImageView = itemView.findViewById(R.id.imageView)
            txt_title = itemView.findViewById(R.id.txt_title)
            txt_time = itemView.findViewById(R.id.txt_date)
            txt_desc = itemView.findViewById(R.id.txt_desc)
            txt_desc = itemView.findViewById(R.id.txt_desc)
            constraintLayout = itemView.findViewById(R.id.constraintLayout)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animated_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val item = summaryList[position]
        holder.itemView.imageView.animation = AnimationUtils.loadAnimation(context,R.anim.fade_transition_animation)
        holder.itemView.constraintLayout.animation = AnimationUtils.loadAnimation(context,R.anim.fade_scale_animation)
//        txt_title.text = item.pet_name
//        txt_score.text = item.survey_count.toString()
//        txt_breed.text = item.breed
//        txt_time.text = time

//        Glide.with(context)
//            .load(IMAGE_BASE_URL + "" + item.img_id)
//            .into(circleImageView)


    }

    override fun getItemCount() = 22

}