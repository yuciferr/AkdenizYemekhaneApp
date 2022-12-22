package com.example.akdenizyemekhaneapp.ui.feed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.akdenizyemekhaneapp.R
import com.example.akdenizyemekhaneapp.databinding.FragmentFeedBinding

class FeedFragment : Fragment() {

    private lateinit var binding: FragmentFeedBinding
    private lateinit var feedRecyclerAdapter: FeedRecyclerAdapter
    private lateinit var feedList: List<Feed>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFeedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.feedRecyclerView.setHasFixedSize(true)
        feedList = listOf(
            Feed("Yusuf Samed Çelik", "Akdeniz Üniversitesi yemekhane yemekleri çok güzel", "5.0"),
            Feed("Ulaş Gergerli", "Akdeniz Üniversitesi yemekhane yemekleri çok güzel", "4.0"),
            Feed("Emre Yaşar", "Akdeniz Üniversitesi yemekhane yemekleri çok güzel", "4.5")
        )

        feedRecyclerAdapter = FeedRecyclerAdapter(feedList)
        binding.feedRecyclerView.adapter = feedRecyclerAdapter
        binding.feedRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

}