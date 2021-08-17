package com.QalamInstitute.qalam.views.adpters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.QalamInstitute.qalam.R
import com.QalamInstitute.qalam.views.models.Podcast
import com.QalamInstitute.qalam.views.models.PodcastSeries
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.podcast_series_view_holder_layout.view.*

class PodcastSeriesListAdapter():ListAdapter<PodcastSeries,PodcastSeriesListAdapter.PodcastSeriesViewHolder>(PodcastSeriesComparator()){



     class PodcastSeriesViewHolder(itemView: View, val context: Context): RecyclerView.ViewHolder(itemView){


         private val image = itemView.podcastSeriesImage
         private val title = itemView.podcastSeriesTitle

         fun bind(podcast: PodcastSeries){
             Log.d("bnomi","bind")

             Glide
                 .with(context)
                 .load(podcast.podcastImage)
                 .into(image)
             title.text=podcast.title
         }



     }



    class PodcastSeriesComparator(): DiffUtil.ItemCallback<PodcastSeries>(){
        override fun areItemsTheSame(oldItem: PodcastSeries, newItem: PodcastSeries): Boolean {
          return false
        }

        override fun areContentsTheSame(oldItem: PodcastSeries, newItem: PodcastSeries): Boolean {
            return false
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PodcastSeriesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.podcast_series_view_holder_layout, parent, false)

        return PodcastSeriesViewHolder(view, parent.context)
    }

    override fun onBindViewHolder(holder: PodcastSeriesViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }


}
