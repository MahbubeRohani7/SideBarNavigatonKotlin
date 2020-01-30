package com.pooyeshgaran.azango.sidebarnavigatonkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.navigationrecyclerview_adapter.view.*

class RecyclerAdapter (val nav_items : List<String>,val clickListener: RecyclerClickListener):
    RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
     val v = LayoutInflater.from(parent.context).inflate(R.layout.navigationrecyclerview_adapter,parent,false)
        return RecyclerViewHolder(v,clickListener)
    }

    override fun getItemCount(): Int {
       return nav_items.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.OnBind(nav_items [position])
    }

    class RecyclerViewHolder(val item : View,val clickListener: RecyclerClickListener) : RecyclerView.ViewHolder(item){
            fun OnBind(nav_items:String){
                item.txt_item.text = nav_items

                item.setOnClickListener(object : View.OnClickListener{
                    override fun onClick(p0: View?) {
                        clickListener.OnClick(nav_items)
                   }


                })


            }
    }
}


