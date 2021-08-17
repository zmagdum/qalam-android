package com.QalamInstitute.qalam.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import jp.wasabeef.glide.transformations.BlurTransformation


import com.QalamInstitute.qalam.R
import com.QalamInstitute.qalam.views.adpters.ViewPodcastListAdapter
import com.QalamInstitute.qalam.views.models.Podcast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions.bitmapTransform
import kotlinx.android.synthetic.main.fragment_view_podcast.*


class ViewPodcastFragment : Fragment(R.layout.fragment_view_podcast) {

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

    private val viewPodcastAdapter=ViewPodcastListAdapter{}


    override fun onStart() {
        super.onStart()
        Glide.
        with(this)
            .load("https://res.cloudinary.com/yelmountahi/image/upload/v1629131787/loada_ykt92l.jpg")
            .apply(bitmapTransform(BlurTransformation(5, 3)))
            .into(ViewPodcastBlureImage)


        Glide
            .with(this)
            .load("https://res.cloudinary.com/yelmountahi/image/upload/v1629131787/loada_ykt92l.jpg")
            .into(viewPodcastMainImage)
    }


    override fun onResume() {
        super.onResume()

        setUpList()

        viewPodcastAdapter.submitList(list)

        SavedBackArrow.setOnClickListener {

            findNavController().popBackStack()
        }
    }


    private fun setUpList(){
        ViewPodcastList.apply {
            this.adapter=viewPodcastAdapter
        }
    }





}