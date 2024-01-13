package com.example.tablayoutapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutapp.fragments.fragment_books
import com.example.tablayoutapp.fragments.fragment_games
import com.example.tablayoutapp.fragments.fragment_movies

class ViewPagerAdapter(fragmentManager:FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
       when(position){
           0->{
               return fragment_books()
           }
           1->{
               return fragment_games()
           }

       }
        return fragment_movies()
    }
}