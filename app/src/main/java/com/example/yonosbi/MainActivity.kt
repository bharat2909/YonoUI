package com.example.yonosbi

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator


class MainActivity : AppCompatActivity() {

    val list : MutableList<MutableList<String>> = mutableListOf()
    val list1:MutableList<String> = mutableListOf()
     val list2:MutableList<String> = mutableListOf()
    lateinit var dot1: DotsIndicator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        list1.add("My Savings Account")
        list1.add("1,32,568")
        list1.add("Total Balance")

        list2.add("Education Loan")
        list2.add("5,87,765")
        list2.add("Total Borrowing")

        list.add(list1)
        list.add(list2)

        val viewPager:ViewPager = findViewById(R.id.viewPager)
        val mViewPagerAdapter = viewPagerAdapter(this, list)
        viewPager.adapter = mViewPagerAdapter
        viewPager.setPageMargin(15)
        dot1=findViewById(R.id.dot1)
        dot1.setViewPager(viewPager)

       val button: Button = findViewById(R.id.buttonSheet)
        val bottomSheet = BottomSheetDialog()
        button.setOnClickListener {
            bottomSheet.show(supportFragmentManager,"BottomSheetView")
        }

    }
}