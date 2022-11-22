package com.example.yonosbi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class viewPagerAdapter(private val mContext:Context,val list:MutableList<MutableList<String>>): PagerAdapter() {


    override fun getCount(): Int {
        return list.size;
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view==`object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val view=LayoutInflater.from(mContext).inflate(R.layout.card_view,container,false)

        var textview1: TextView = view.findViewById(R.id.textView5)
        var textview2: TextView = view.findViewById(R.id.textView7)
        var textview3: TextView = view.findViewById(R.id.textView8)

        textview1.text = list[position][0]
        textview2.text = list[position][1]
        textview3.text = list[position][2]

        container.addView(view, position)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view = `object` as View
        container.removeView(view)
    }
}