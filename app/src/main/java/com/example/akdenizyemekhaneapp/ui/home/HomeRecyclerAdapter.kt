package com.example.akdenizyemekhaneapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.akdenizyemekhaneapp.R
import com.example.akdenizyemekhaneapp.databinding.RvHomeItemBinding

class HomeRecyclerAdapter(private val items: ArrayList<HomeItem>): RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(internal val binding: RvHomeItemBinding): RecyclerView.ViewHolder(binding.root) {


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RvHomeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.apply {
            day.text = items[position].day
            foodTitle.text = items[position].foodName
            foodImage.setImageResource(items[position].foodImg)
            foodTitle2.text = items[position].foodName2
            foodImage2.setImageResource(items[position].foodImg2)
            foodTitle3.text = items[position].foodName3
            foodImage3.setImageResource(items[position].foodImg3)
            foodTitle4.text = items[position].foodName4
            foodImage4.setImageResource(items[position].foodImg4)

            root.setOnClickListener {
                Navigation.findNavController(holder.binding.root).navigate(R.id.action_homeFragment_to_detailFragment)
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}