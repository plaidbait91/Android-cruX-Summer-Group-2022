package com.example.travelwriter

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.travelwriter.databinding.DetailsFragmentBinding

class DetailsFragment : Fragment() {

    companion object {
        fun newInstance() = DetailsFragment()
    }

    private lateinit var viewModel: DetailsViewModel
    private lateinit var binding: DetailsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DetailsFragmentBinding.inflate(layoutInflater)

        return binding.root
    }

}