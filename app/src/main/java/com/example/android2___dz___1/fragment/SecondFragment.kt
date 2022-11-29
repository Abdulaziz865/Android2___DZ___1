package com.example.android2___dz___1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android2___dz___1.adapter.RecyclerAdapter
import com.example.android2___dz___1.databinding.FragmentSecondBinding
import com.example.android2___dz___1.model.RecyclerModel
import com.example.android2___dz___1.repository.RecyclerRepository

class SecondFragment : Fragment() {

    private var binding: FragmentSecondBinding?= null
    private val repository = RecyclerRepository()
    private lateinit var list: ArrayList<RecyclerModel>
    private val adapter : RecyclerAdapter = RecyclerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding?.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = repository.getListOfCharacters()
        adapter.setData(list)
        initialize()
    }

    private fun initialize() {
        binding?.rvListTwoFragment?.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}