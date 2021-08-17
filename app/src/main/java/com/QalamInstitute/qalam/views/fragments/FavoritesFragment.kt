package com.QalamInstitute.qalam.views.fragments

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.QalamInstitute.qalam.R
import com.QalamInstitute.qalam.views.adpters.FavoritesListAdapter
import com.QalamInstitute.qalam.views.models.Podcast
import kotlinx.android.synthetic.main.fragment_favorites.*
import kotlinx.android.synthetic.main.fragment_home.*


class FavoritesFragment : Fragment(R.layout.fragment_favorites) {



    private val favoritesAdapter= FavoritesListAdapter {
        findNavController().navigate(R.id.action_destination_library_to_viewPodcastFragment)

    }


    private val list= listOf(
        Podcast("Knowledge Intensive (Gain the knowledge of how to practically…"
                ,1,""),
        Podcast("Qalam Online (1-hour daily courses to get to know who you are right …",1,""),
        Podcast("Travel with Us (Reach spiritual goals,learn under esteemed and reputable… ",1,""),
        Podcast("Knowledge Intensive (Gain the knowledge of how to practically…",1,"")
    )


    override fun onStart() {
        super.onStart()
        setUpPodcastList()

    }


    override fun onResume() {
        super.onResume()

        favoritesAdapter.submitList(list)
    }


    private fun setUpPodcastList(){
        FavoritesList.apply {
            this.adapter=favoritesAdapter

        }


    }


}