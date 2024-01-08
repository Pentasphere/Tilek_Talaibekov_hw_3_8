package com.geeks.tilek_talaibekov_hw_3_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.geeks.tilek_talaibekov_hw_3_8.databinding.FragmentMainBinding
import com.geeks.tilek_talaibekov_hw_3_8.databinding.FragmentNextBinding

class NextFragment : Fragment() {

    private lateinit var binding: FragmentNextBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNextBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val model = it.getSerializable("start") as Series
            binding.tvName.text = model.name
            binding.tvStatus.text = model.status
            Glide.with(binding.imgPoster).load(model.img).into(binding.imgPoster)

        }
    }

}