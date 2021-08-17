package com.QalamInstitute.qalam.views.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment

import com.QalamInstitute.qalam.R
import com.QalamInstitute.qalam.views.adpters.PodcastListAdapter
import com.QalamInstitute.qalam.views.models.Podcast
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(R.layout.fragment_home) {



    private val podcastAdapter=PodcastListAdapter()
    private val list= listOf(
        Podcast("",3,"http://www.qalaminstitute.org/wp-content/uploads/40hadithnawawi.jpg"),
        Podcast("",3,"http://www.qalaminstitute.org/wp-content/uploads/beginingofguidance.jpg"),
        Podcast("",3,"http://www.qalaminstitute.org/wp-content/uploads/divine-parables.png"),
        Podcast("",3,"http://www.qalaminstitute.org/wp-content/uploads/heartwork-purification.jpg"),
        Podcast("",3,"http://www.qalaminstitute.org/wp-content/uploads/khutbahs.jpg"),
        Podcast("",3,"http://www.qalaminstitute.org/wp-content/uploads/Lives-of-the-prophets_updated.jpg"),
        Podcast("",3,"http://www.qalaminstitute.org/wp-content/uploads/Seerah-Album-Art-1.jpg"),
        Podcast("",3,"http://www.qalaminstitute.org/wp-content/uploads/characteristics.jpeg"),
        Podcast("",3,"http://www.qalaminstitute.org/wp-content/uploads/Rights-of-Companionship.jpg"),
        Podcast("",3,"http://www.qalaminstitute.org/wp-content/uploads/The-Sufficient-Answer_Podcast-Cover.png")
        )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onResume() {
        super.onResume()
        setUpPodcastList()

        podcastAdapter.submitList(list)
    }



    private fun setUpPodcastList(){
        podcastList.apply {
            this.adapter=podcastAdapter

        }


    }

}