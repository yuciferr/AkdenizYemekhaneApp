package com.example.akdenizyemekhaneapp.ui.map

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.akdenizyemekhaneapp.databinding.RvMapItemBinding

class MapRecyclerAdapter(private val items: List<MapItem>): RecyclerView.Adapter<MapRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: RvMapItemBinding): RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RvMapItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.binding.apply {
            mapImage.setImageResource(item.mapImage)
            titleYemekhane.text = item.titleYemekhane
            progressBar.progress = item.progressBar
            openHours.text = item.openHours
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}