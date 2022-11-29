package com.example.android2___dz___1.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android2___dz___1.adapter.RecyclerAdapter
import com.example.android2___dz___1.databinding.FragmentFirstBinding
import com.example.android2___dz___1.model.RecyclerModel
import com.example.android2___dz___1.repository.RecyclerRepository

class FirstFragment : Fragment() {

    private val repository = RecyclerRepository()
    private lateinit var list: ArrayList<RecyclerModel>
    private var binding: FragmentFirstBinding? = null
    private val adapter : RecyclerAdapter = RecyclerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = repository.getListOfCharacters()
        adapter.setData(list)
        initialize()
//        setUpListener()
    }

    private fun initialize() {
        binding?.rvListOneFragment?.adapter = adapter
    }
//    private fun setUpListener() {
//        binding?.tvText?.setOnClickListener {
//            findNavController().navigate(
//                FirstFragmentDirections.action
//        }
//    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}