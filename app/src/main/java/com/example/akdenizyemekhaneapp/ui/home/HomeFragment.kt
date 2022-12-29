package com.example.akdenizyemekhaneapp.ui.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akdenizyemekhaneapp.R
import com.example.akdenizyemekhaneapp.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeAdapter: HomeRecyclerAdapter
    private lateinit var homeItems: ArrayList<HomeItem>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Home Recycler View
        binding.homeRecyclerView.setHasFixedSize(true)

        homeItems = ArrayList()
        homeItems.add(HomeItem("Monday", "Kuru Fasulye", R.drawable.kurufasulye,
            "Pirinç Pilavı", R.drawable.pilav, "Mevsim Salatası",
            R.drawable.salata, "Ayran", R.drawable.ayran))

        homeItems.add(HomeItem("Tuesday", "Mercimek Çorbası", R.drawable.mercimek,
            "Kıymalı Makarna", R.drawable.makarna, "Tulumba Tatlısı",
            R.drawable.tulumba, "Yoğurt", R.drawable.yogurt))

        homeItems.add(HomeItem("Wednesday", "Rosto Köfte", R.drawable.kofte,
            "Bulgur Pilavı", R.drawable.bulgur, "Tahinli Piyaz",
            R.drawable.piyaz, "Ayran", R.drawable.ayran))

        homeItems.add(HomeItem("Thursday", "Etli Nohut", R.drawable.nohut,
            "Pirinç Pilavı", R.drawable.pilav, "Mevsim Salatası",
            R.drawable.salata, "Tulumba Tatlısı", R.drawable.tulumba))

        homeItems.add(HomeItem("Friday", "Mercimek çorbası", R.drawable.mercimek,
            "Kıymalı Makarna", R.drawable.makarna, "Kuru Fasulye",
            R.drawable.kurufasulye, "Ayran", R.drawable.ayran))

        homeAdapter = HomeRecyclerAdapter(homeItems)
        binding.homeRecyclerView.adapter = homeAdapter
        binding.homeRecyclerView.layoutManager = LinearLayoutManager(context)

        binding.apply {
            addBalance.setOnClickListener{
                AddBalanceDialog().show(parentFragmentManager, "Add Balance Dialog")
            }
            balance.setOnClickListener {
                AddBalanceDialog().show(parentFragmentManager, "Add Balance Dialog")
            }

        }

    }

}