package com.example.travelwriter.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.travelwriter.R
import com.example.travelwriter.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = MainFragmentBinding.inflate(inflater)

        binding.addButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainFragment_to_addArticleFragment)
        }
        return binding.root
    }

}