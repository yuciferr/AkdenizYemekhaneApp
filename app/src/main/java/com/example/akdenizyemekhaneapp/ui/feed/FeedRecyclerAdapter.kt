package com.example.akdenizyemekhaneapp.ui.feed

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.akdenizyemekhaneapp.databinding.RvFeedItemBinding

class FeedRecyclerAdapter(private val feedList: List<Feed>):
    RecyclerView.Adapter<FeedRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(internal val binding: RvFeedItemBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RvFeedItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply{
            feedTitle.text = feedList[position].feedTitle
            feedComment.text = feedList[position].feedComment
            feedRate.text = feedList[position].feedRate

        }
    }

    override fun getItemCount(): Int {
       return feedList.size
    }
}