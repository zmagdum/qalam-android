package com.QalamInstitute.qalam.views.fragments

import androidx.fragment.app.Fragment

import com.QalamInstitute.qalam.R
import com.QalamInstitute.qalam.views.adpters.PodcastSeriesListAdapter
import com.QalamInstitute.qalam.views.models.PodcastSeries
import kotlinx.android.synthetic.main.fragment_podcast_series.*

class PodcastSeriesFragment : Fragment(R.layout.fragment_podcast_series) {

    private val podcastSeriesAdapter=PodcastSeriesListAdapter()

    private val podcastSeriesItemList= listOf(
        PodcastSeries("40 Ahadith of Imam Nawawi","http://www.qalaminstitute.org/wp-content/uploads/40hadithnawawi.jpg"),
        PodcastSeries("The Beginning of Guidance","http://www.qalaminstitute.org/wp-content/uploads/beginingofguidance.jpg"),
        PodcastSeries("Divine Parables","http://www.qalaminstitute.org/wp-content/uploads/divine-parables.png"),
        PodcastSeries("Heartwork","http://www.qalaminstitute.org/wp-content/uploads/heartwork-purification.jpg"),
        PodcastSeries("Khutbah","http://www.qalaminstitute.org/wp-content/uploads/khutbahs.jpg"),
        PodcastSeries("Lives of The Prophets","http://www.qalaminstitute.org/wp-content/uploads/Lives-of-the-prophets_updated.jpg"),
        PodcastSeries("Characteristics from the Quran","http://www.qalaminstitute.org/wp-content/uploads/characteristics.jpeg"),
        PodcastSeries("Seerah","http://www.qalaminstitute.org/wp-content/uploads/Seerah-Album-Art-1.jpg"),
        PodcastSeries("Sufficient Answer","http://www.qalaminstitute.org/wp-content/uploads/The-Sufficient-Answer_Podcast-Cover.png"),
        PodcastSeries("Companionship","http://www.qalaminstitute.org/wp-content/uploads/Rights-of-Companionship.jpg"),
        )


    override fun onResume() {
        super.onResume()
        setUpPodcastSeriesList()
        podcastSeriesAdapter.submitList(podcastSeriesItemList)

    }

    private fun setUpPodcastSeriesList(){
        podcastSeriesList.apply {

            this.adapter=podcastSeriesAdapter
        }
    }

}