package com.example.odev4_atacanugurlu

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.odev4_atacanugurlu.databinding.FragmentLiveDataBinding

class LiveDataFragment : Fragment() {

    private lateinit var viewModel: LiveDataViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentLiveDataBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_live_data, container, false
        )



        binding.button.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_liveDataFragment_to_loginFragment)
        )

        binding.sendButton.setOnClickListener {
            viewModel.input.value = binding.editTextTextPersonName.text.toString()
            val newInput = viewModel.input.value
            if (newInput != null) {
                viewModel.onNewInput(newInput)
            }
            binding.textView2.text = viewModel.input.value
        }

        viewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)
        return binding.root
    }


}