package com.example.myapplication

import android.bluetooth.BluetoothAdapter
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    var list: MutableList<String> = mutableListOf()
    var text: TextView? = null
    var recycleView: RecyclerView? = null

    var textList: ArrayList<String> =
        arrayListOf("fafas", "fdasfas", "fdasfdasf", "fdsfaf", "fadfasdsfeewe");

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.add("fdsfa")
        list.add("fsdafs")
        list.add("fsafdafsdf")
        list.sort()
        text = findViewById(R.id.text)
        text?.text = list.toString()
        recycleView = findViewById(R.id.recycleView)

        //使用Recycler
        val layoutManager = GridLayoutManager(this,2)
        recycleView?.layoutManager = layoutManager
        val recycleViewAdapter: RecycleViewAdapter = RecycleViewAdapter(textList)
        recycleView?.adapter = recycleViewAdapter
//       val singleton: Singleton= Singleton.getInstance()
//测试指令提交

           ///

    }

    override fun onResume() {
        super.onResume()
    }
}