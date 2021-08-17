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
import kotlinx.android.synthetic.main.fragment_view_podcast.view.*
import kotlinx.android.synthetic.main.view_podcast_view_holder_layout.view.*

class ViewPodcastListAdapter(val podcastClick: () -> Unit) :
    ListAdapter<Podcast, ViewPodcastListAdapter.ViewPodcastViewHolder>(ViewPodcastComparator()) {


    class ViewPodcastViewHolder(itemView: View,val context:Context) : RecyclerView.ViewHolder(itemView) {

        private  val title = itemView.viewPodcastTitle
        private val image=itemView.viewPodcastImage

        init {
            title.setOnClickListener {

            }
        }


        fun bind(podcast: Podcast) {


            Glide.with(context)
                .load(podcast.podcastArt)
                .into(image)

        }
    }

    class ViewPodcastComparator() : DiffUtil.ItemCallback<Podcast>() {
        override fun areItemsTheSame(oldItem: Podcast, newItem: Podcast): Boolean {
            return false
        }

        override fun areContentsTheSame(oldItem: Podcast, newItem: Podcast): Boolean {
            return false
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPodcastViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_podcast_view_holder_layout, parent, false)


        return ViewPodcastViewHolder(view,parent.context)
    }

    override fun onBindViewHolder(holder: ViewPodcastViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }

}