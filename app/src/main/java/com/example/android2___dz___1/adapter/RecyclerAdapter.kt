package com.example.android2___dz___1.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android2___dz___1.databinding.ItemNameBinding
import com.example.android2___dz___1.model.RecyclerModel

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var list: List<RecyclerModel> = listOf()

    fun setData(listCharacters: List<RecyclerModel>) {
        this.list = listCharacters
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemNameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(private var binding: ItemNameBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(characters: RecyclerModel) {
            binding.tvName.text = characters.name
        }
    }
}
