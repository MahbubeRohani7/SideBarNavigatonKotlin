package com.pooyeshgaran.azango.sidebarnavigatonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),RecyclerClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = ArrayList<String>()
        list.add("Home")
        list.add("Rate")
        list.add("Help")
        list.add("privacy")

        val adapter = RecyclerAdapter(list,this)

        recycler.adapter = adapter

        imgDrawer.setOnClickListener {
            if (drawer_layout.isDrawerOpen(Gravity.LEFT)) {
                drawer_layout.closeDrawer(Gravity.LEFT)

            } else {
                drawer_layout.openDrawer(Gravity.LEFT)
            }

        }
    }
    override fun OnClick(nav_items: String) {
   Toast.makeText(this,nav_items,Toast.LENGTH_LONG).show()
    }

}

