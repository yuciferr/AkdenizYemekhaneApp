package com.example.akdenizyemekhaneapp.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.akdenizyemekhaneapp.databinding.RvDetailItemBinding

class DetailRecyclerAdapter(private val items: List<DetailItem>): RecyclerView.Adapter<DetailRecyclerAdapter.ViewHolder>() {
    inner class ViewHolder(internal val binding: RvDetailItemBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RvDetailItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            detailTitle.text = items[position].detailTitle
            detailImg.setImageResource(items[position].detailImg)
            carbs.text = items[position].carbs
            proteins.text = items[position].protein
            fats.text = items[position].fat
            calorie.text = items[position].calorie
            veganCheck.setImageResource(items[position].vegan)
            allergenCheck.setImageResource(items[position].allergen)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

}