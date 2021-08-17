package com.QalamInstitute.qalam.views.adpters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.QalamInstitute.qalam.views.fragments.DownloadsFragment
import com.QalamInstitute.qalam.views.fragments.FavoritesFragment
import com.QalamInstitute.qalam.views.fragments.LibraryFragment

class LibraryStateAdapter(fragmentActivity: LibraryFragment):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> FavoritesFragment()
            else -> DownloadsFragment()
        }

    }


}