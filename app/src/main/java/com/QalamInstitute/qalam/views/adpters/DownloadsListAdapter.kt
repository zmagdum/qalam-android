package com.QalamInstitute.qalam.views.adpters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.QalamInstitute.qalam.R
import com.QalamInstitute.qalam.views.models.Podcast
import kotlinx.android.synthetic.main.downloads_view_holder_layout.view.*

class DownloadsListAdapter(val podcastClick: () -> Unit):ListAdapter<Podcast,DownloadsListAdapter.DownloadsViewHolder>(DownloadsComparator()) {


    inner class DownloadsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){


        private val title=itemView.downloadsTitle


        init {

            title.setOnClickListener {

                podcastClick()
            }
        }


        fun bind(podcast: Podcast){

            title.text=podcast.podcastTitle
        }
    }


    class DownloadsComparator(): DiffUtil.ItemCallback<Podcast>(){
        override fun areItemsTheSame(oldItem: Podcast, newItem: Podcast): Boolean {
            return false
        }

        override fun areContentsTheSame(oldItem: Podcast, newItem: Podcast): Boolean {
            return false
        }


    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DownloadsViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.downloads_view_holder_layout, parent, false)

        return DownloadsViewHolder(view)
    }

    override fun onBindViewHolder(holder: DownloadsViewHolder, position: Int) {

        val current = getItem(position)
        holder.bind(current)
    }

}