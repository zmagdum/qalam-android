package com.QalamInstitute.qalam.views.adpters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.QalamInstitute.qalam.R
import com.QalamInstitute.qalam.views.models.Podcast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.my_podcast_view_holder_layout.view.*

class PodcastListAdapter():ListAdapter<Podcast,PodcastListAdapter.PodcastViewHolder> (PodcastComparator()){


    class PodcastViewHolder(itemView: View,val context:Context):RecyclerView.ViewHolder(itemView){


        private val image = itemView.podcastImage
        private val title = itemView.podcastTitle
        private val episodeCount=itemView.PodcastCount

        fun bind(podcast: Podcast){

            Glide.with(context).load(podcast.podcastArt)
                .into(image)

        }



    }



    class PodcastComparator(): DiffUtil.ItemCallback<Podcast>(){
        override fun areItemsTheSame(oldItem: Podcast, newItem: Podcast): Boolean {
            return false
        }

        override fun areContentsTheSame(oldItem: Podcast, newItem: Podcast): Boolean {
            return false
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PodcastViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_podcast_view_holder_layout, parent, false)

        return PodcastViewHolder(view,parent.context)
    }

    override fun onBindViewHolder(holder: PodcastViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }
}