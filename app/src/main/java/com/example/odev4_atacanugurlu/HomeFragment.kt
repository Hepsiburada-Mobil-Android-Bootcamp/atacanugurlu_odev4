package com.example.odev4_atacanugurlu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.odev4_atacanugurlu.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
     override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentHomeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false)
        binding.homeButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_liveDataFragment)
        )
         Toast.makeText(context, "Scroll down and press the 'Home' button to navigate to the live data screen", Toast.LENGTH_LONG).show()
        return binding.root
    }
}