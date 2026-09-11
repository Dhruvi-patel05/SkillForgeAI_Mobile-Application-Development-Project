package com.example.skillforgeai.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skillforgeai.databinding.ItemDashboardCardBinding

class DashboardAdapter(
    private val list: List<DashboardItem>
) : RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {

    inner class ViewHolder(
        val binding: ItemDashboardCardBinding
    ) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val binding =
            ItemDashboardCardBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {

        val item = list[position]

        holder.binding.imgIcon.setImageResource(
            item.icon
        )

        holder.binding.txtTitle.text =
            item.title

        holder.binding.txtValue.text =
            item.value
    }

    override fun getItemCount(): Int {
        return list.size
    }
}