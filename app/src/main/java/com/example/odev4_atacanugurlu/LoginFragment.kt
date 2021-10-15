package com.example.odev4_atacanugurlu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.odev4_atacanugurlu.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false)
        binding.loginButton.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_homeFragment)
        )
        Toast.makeText(context, "Press 'Login' to navigate to the second screen", Toast.LENGTH_SHORT).show()
        return binding.root
    }
}