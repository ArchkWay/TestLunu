package com.example.testlunu.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testlunu.R
import com.example.testlunu.db.CitySaved
import kotlinx.android.synthetic.main.city_item.view.*

class CityAdapter internal constructor(
    context: Context,
    private val touchEvent: TouchEvent
) : RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    interface TouchEvent {
        fun onClick(item: CitySaved)
    }

    private val inflater: LayoutInflater = LayoutInflater.from(context)
    private var objects = emptyList<CitySaved>()

    inner class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val itemView = inflater.inflate(R.layout.city_item, parent, false)
        return CityViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val current = objects[position]

        holder.itemView.tvCityName.text = current.name
        holder.itemView.tvCityTemperature.text = current.temperature


        holder.itemView.setOnClickListener {
            touchEvent.onClick(current)
        }
    }

    internal fun addItem(item: CitySaved) {
        this.objects += item
        notifyDataSetChanged()
    }

    override fun getItemCount() = objects.size
}
