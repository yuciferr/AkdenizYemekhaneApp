package com.example.akdenizyemekhaneapp.ui.map

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akdenizyemekhaneapp.R
import com.example.akdenizyemekhaneapp.databinding.FragmentMapBinding

class MapFragment : Fragment() {
    private lateinit var binding: FragmentMapBinding
    private lateinit var adapter: MapRecyclerAdapter
    private lateinit var items: List<MapItem>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMapBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.setHasFixedSize(true)

        items = listOf(
            MapItem(R.drawable.merkezi, "Merkezi Yemekhane", 80,
                "Open Hours: \\n11:15 - 14:15 / 16:15 - 18:15"),
            MapItem(R.drawable.ilahi, "İlahiyat Yemekhanesi", 40,
                "Open Hours: \\n11:15 - 14:15 / 16:15 - 18:15"),
            MapItem(R.drawable.dis, "Diş Yemekhanesi", 30,
                "Open Hours: \\n11:15 - 14:15 / 16:15 - 18:15"),
            MapItem(R.drawable.merkezi, "Yakut Yemekhanesi", 65,
                "Open Hours: \\n11:15 - 14:15 / 16:15 - 18:15")
        )

        adapter = MapRecyclerAdapter(items)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

}