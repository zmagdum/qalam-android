package com.QalamInstitute.qalam.views.fragments


import androidx.fragment.app.Fragment

import com.QalamInstitute.qalam.R
import com.QalamInstitute.qalam.views.adpters.LibraryStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_library.*


class LibraryFragment : Fragment(R.layout.fragment_library) {


    override fun onStart() {
        super.onStart()
        setUpTabLayout()
    }



    private fun setUpTabLayout() {
        FavoriteViewPager.adapter = LibraryStateAdapter(this)
        TabLayoutMediator(FavoriteTabLayout, FavoriteViewPager) { tab, position ->

            when (position) {
                0 -> {
                    tab.text = "Favorites"
                }
                1 -> {
                    tab.text = "Downloads"
                }
            }

        }.attach()

    }


}