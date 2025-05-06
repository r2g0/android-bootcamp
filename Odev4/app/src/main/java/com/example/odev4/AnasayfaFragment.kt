package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.odev4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment



        binding.buttonA.setOnClickListener { x ->

            val gecisA = AnasayfaFragmentDirections.sayfaAGecis()
            x.findNavController().navigate(gecisA)
        }

        binding.buttonX.setOnClickListener { x ->

            val gecisX = AnasayfaFragmentDirections.sayfaXGecis()
            x.findNavController().navigate(gecisX)
        }

        return binding.root


    }


}