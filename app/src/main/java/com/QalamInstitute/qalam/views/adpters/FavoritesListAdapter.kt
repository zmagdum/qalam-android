package com.QalamInstitute.qalam.views.adpters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.QalamInstitute.qalam.R
import com.QalamInstitute.qalam.views.models.Podcast
import kotlinx.android.synthetic.main.favorites_view_holder_layout.view.*

class FavoritesListAdapter(val podcastClick: () -> Unit):ListAdapter<Podcast,FavoritesListAdapter.FavoritesViewHolder> (FavoritesComparator()){



   inner class FavoritesViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){


        private val title=itemView.favoritesTitle

        init {

            title.setOnClickListener {


                podcastClick()
            }
        }


        fun bind(podcast: Podcast){

            title.text=podcast.podcastTitle
        }
    }


    class FavoritesComparator(): DiffUtil.ItemCallback<Podcast>(){
        override fun areItemsTheSame(oldItem: Podcast, newItem: Podcast): Boolean {
            return false
        }

        override fun areContentsTheSame(oldItem: Podcast, newItem: Podcast): Boolean {
            return false
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritesViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.favorites_view_holder_layout, parent, false)

        return FavoritesViewHolder(view)

    }

    override fun onBindViewHolder(holder: FavoritesViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }


}