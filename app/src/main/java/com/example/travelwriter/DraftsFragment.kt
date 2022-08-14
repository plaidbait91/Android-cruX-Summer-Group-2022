package com.example.travelwriter

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.travelwriter.databinding.DraftsFragmentBinding

class DraftsFragment : Fragment() {

    companion object {
        fun newInstance() = DraftsFragment()
    }

    private lateinit var viewModel: DraftsViewModel
    private lateinit var binding: DraftsFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DraftsFragmentBinding.inflate(layoutInflater)

        return binding.root
    }

}