package com.example.travelwriter

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.travelwriter.databinding.ArticleFragmentBinding

class ArticleFragment : Fragment() {

    companion object {
        fun newInstance() = ArticleFragment()
    }

    private lateinit var viewModel: ArticleViewModel
    private lateinit var binding: ArticleFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ArticleFragmentBinding.inflate(layoutInflater)

        return binding.root
    }


}