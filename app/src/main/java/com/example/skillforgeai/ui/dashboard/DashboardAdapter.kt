package com.example.skillforgeai.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skillforgeai.databinding.ItemDashboardCardBinding

class DashboardAdapter(
    private val dashboardList: List<DashboardItem>
) : RecyclerView.Adapter<DashboardAdapter.ViewHolder>() {

    inner class ViewHolder(
        private val binding: ItemDashboardCardBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: DashboardItem) {

            binding.imgIcon.setImageResource(item.icon)

            binding.txtTitle.text = item.title

            binding.txtValue.text = item.value
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): ViewHolder {

        val binding = ItemDashboardCardBinding.inflate(
                LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder, position: Int) {

        holder.bind(dashboardList[position])
    }

    override fun getItemCount(): Int {
        return dashboardList.size
    }
}