package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.odev4.databinding.FragmentSayfaABinding
import com.example.odev4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {

    private lateinit var binding: FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaBBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment


        binding.buttonB2Y.setOnClickListener { x ->

            val gecisB2Y = SayfaBFragmentDirections.sayfaB2YGecis()
            x.findNavController().navigate(gecisB2Y)
        }






        return binding.root
    }


}