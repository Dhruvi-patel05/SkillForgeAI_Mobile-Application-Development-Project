package com.example.skillforgeai.ui.notifications

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skillforgeai.data.model.Notification
import com.example.skillforgeai.databinding.ItemNotificationBinding

class NotificationAdapter(
    private val notificationList: List<Notification>
) : RecyclerView.Adapter<NotificationAdapter.ViewHolder>() {

    inner class ViewHolder(
        private val binding: ItemNotificationBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(notification: Notification) {

            binding.txtTitle.text =
                notification.title

            binding.txtMessage.text =
                notification.message

            binding.txtTime.text =
                notification.time
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val binding =
            ItemNotificationBinding.inflate(
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

        holder.bind(
            notificationList[position]
        )
    }

    override fun getItemCount(): Int {
        return notificationList.size
    }
}