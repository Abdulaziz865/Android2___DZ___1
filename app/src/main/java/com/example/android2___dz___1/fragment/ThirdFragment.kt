package com.example.android2___dz___1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android2___dz___1.adapter.RecyclerAdapter
import com.example.android2___dz___1.databinding.FragmentThirdBinding
import com.example.android2___dz___1.model.RecyclerModel
import com.example.android2___dz___1.repository.RecyclerRepository

class ThirdFragment : Fragment() {

    private var binding: FragmentThirdBinding? = null
    private val repository = RecyclerRepository()
    private lateinit var list: ArrayList<RecyclerModel>
    private val adapter : RecyclerAdapter = RecyclerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = repository.getListOfCharacters()
        adapter.setData(list)
        initialize()
    }

    private fun initialize() {
        binding?.rvListThreeFragment?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}