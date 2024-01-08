package com.geeks.tilek_talaibekov_hw_3_8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks.tilek_talaibekov_hw_3_8.databinding.ItemSerialsBinding

class SeriesAdapter(private val seriesList: List<Series>, var onClick: (position: Series) -> Unit) :
    RecyclerView.Adapter<SeriesAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemSerialsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount() = seriesList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(seriesList[position])
    }

    inner class ViewHolder(private val binding: ItemSerialsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(series: Series) {
            binding.apply {
                series.apply {
                    tvName.text = name
                    tvStatus.text = status
                    imgPoster.loadImage(img)
                }
            }
            itemView.setOnClickListener {
                onClick(series)
            }
        }
    }


}
