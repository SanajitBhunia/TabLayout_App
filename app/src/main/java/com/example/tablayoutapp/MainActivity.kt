package com.example.tablayoutapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayoutapp.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val tabsArray= arrayOf("Books","Games","Movies")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager:ViewPager2=findViewById(R.id.viewpager)
        val tablayout:TabLayout=findViewById(R.id.tablayout)

        val myAdapter=ViewPagerAdapter(
            supportFragmentManager,
            lifecycle
        )

        viewPager.adapter=myAdapter

        //connecting the viewpager with tab layout
        TabLayoutMediator(tablayout,viewPager){
            tab,position -> tab.text=tabsArray[position]
        }.attach()
    }
}