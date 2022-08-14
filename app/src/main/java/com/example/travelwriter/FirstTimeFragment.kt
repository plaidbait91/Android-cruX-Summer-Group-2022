package com.example.travelwriter

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.travelwriter.databinding.FirstTimeFragmentBinding

class FirstTimeFragment : Fragment() {

    companion object {
        fun newInstance() = FirstTimeFragment()
    }

    private lateinit var viewModel: FirstTimeViewModel
    private lateinit var binding: FirstTimeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this)[FirstTimeViewModel::class.java]
        binding = FirstTimeFragmentBinding.inflate(layoutInflater)
        binding.viewmodel = viewModel
        val prefs = activity?.getPreferences(Context.MODE_PRIVATE) ?: return binding.root

        binding.button.setOnClickListener {
            Log.v("Button", "Pressed")

            if(viewModel.username.value!!.isEmpty()) binding.nameField.error = "Please enter a name"

            else {
                with(prefs.edit()) {
                    putString("user", viewModel.username.value)
                    apply()
                }

                Log.v("Button", "Pressed")

                it.findNavController().navigate(R.id.action_firstTimeFragment_to_mainFragment)
            }

        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

}