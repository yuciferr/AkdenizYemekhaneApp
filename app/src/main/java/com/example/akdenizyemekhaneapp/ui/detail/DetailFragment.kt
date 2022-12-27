package com.example.akdenizyemekhaneapp.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akdenizyemekhaneapp.R
import com.example.akdenizyemekhaneapp.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private lateinit var adapter: DetailRecyclerAdapter
    private lateinit var items: List<DetailItem>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.detailRecyclerView.setHasFixedSize(true)

        items = listOf(
            DetailItem("Kuru Fasulye",
                R.drawable.kurufasulye,
                "Carbs: 40g",
                "Protein: 24g",
                "Fat: 5g",
                "Calories: 280",
                R.drawable.ic_round_check_24,
                R.drawable.ic_red_round_close_24),

            DetailItem("Pirinç Pilavı",
                R.drawable.pilav,
                "Carbs: 80g",
                "Protein: 10g",
                "Fat: 10g",
                "Calories: 300",
                R.drawable.ic_round_check_24,
                R.drawable.ic_red_round_close_24),

            DetailItem("Mevsim Salatası",
                R.drawable.salata,
                "Carbs: 30g",
                "Protein: 1g",
                "Fat: 8g",
                "Calories: 98",
                R.drawable.ic_round_check_24,
                R.drawable.ic_red_round_close_24),

            DetailItem("Ayran",
                R.drawable.ayran,
                "Carbs: 20g",
                "Protein: 5g",
                "Fat: 5g",
                "Calories: 81",
                R.drawable.ic_round_check_24,
                R.drawable.ic_red_round_close_24)
        )

        adapter = DetailRecyclerAdapter(items)
        binding.detailRecyclerView.adapter = adapter
        binding.detailRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        binding.backButton.setOnClickListener {
            requireActivity().onBackPressed()
        }
        binding.leftIcon.setOnClickListener {
            requireActivity().onBackPressed()
        }

        binding.rateButton.setOnClickListener {
            //TODO: Rate button
        }

    }
}