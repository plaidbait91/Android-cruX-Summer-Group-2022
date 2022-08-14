package com.example.travelwriter

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.travelwriter.databinding.AddArticleFragmentBinding

class AddArticleFragment : Fragment() {

    companion object {
        fun newInstance() = AddArticleFragment()
    }

    private lateinit var viewModel: AddArticleViewModel
    private lateinit var binding: AddArticleFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AddArticleFragmentBinding.inflate(layoutInflater)

        binding.create.setOnClickListener {
            it.findNavController().navigate(R.id.action_addArticleFragment_to_mainFragment)
        }

        binding.draft.setOnClickListener {
            it.findNavController().navigate(R.id.action_addArticleFragment_to_draftsFragment)
        }

        return binding.root
    }

}