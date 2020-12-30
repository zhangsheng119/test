package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

/**
 * description:
 * author:zhangsheng
 * create time:2020-12-30 13:11
 */
class RecycleViewAdapter(private val textList: ArrayList<String>) :
    RecyclerView.Adapter<RecycleViewAdapter.MyHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.layout, parent, false)
        return MyHolder(view)
        //测试
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.title.text = textList[position];
        holder.title.setOnClickListener { Toast.makeText(holder.title.context,textList[position],Toast.LENGTH_LONG).show() }

    }

    override fun getItemCount(): Int = textList.size ?: 0


    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val title: TextView = itemView.findViewById(R.id.tv_list)
    }
}