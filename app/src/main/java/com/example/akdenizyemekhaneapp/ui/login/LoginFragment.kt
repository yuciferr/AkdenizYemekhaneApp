package com.example.akdenizyemekhaneapp.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.akdenizyemekhaneapp.R
import com.example.akdenizyemekhaneapp.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener {
            if(binding.studentNumber.text.toString().isNotEmpty() &&
                    binding.password.text.toString().isNotEmpty()){
                navigateToHome()
            }
        }

        binding.guestButton.setOnClickListener {
            navigateToHome()
        }

        binding.closeButton.setOnClickListener{
            navigateToHome()
        }
    }

    private fun navigateToHome() {
        Navigation.findNavController(binding.root).navigate(R.id.action_loginFragment_to_homeFragment)
    }
}