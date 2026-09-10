package com.example.skillforgeai.ui.ai

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skillforgeai.data.model.ChatMessage
import com.example.skillforgeai.databinding.ItemChatMessageBinding

class ChatAdapter(
    private val messageList: MutableList<ChatMessage>
) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    inner class ChatViewHolder(
        private val binding: ItemChatMessageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(message: ChatMessage) {

            binding.txtMessage.text =
                message.message

            binding.txtSender.text =
                if (message.isUser)
                    "You"
                else
                    "AI Mentor"
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChatViewHolder {

        val binding =
            ItemChatMessageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )

        return ChatViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ChatViewHolder,
        position: Int
    ) {

        holder.bind(messageList[position])
    }

    override fun getItemCount(): Int {
        return messageList.size
    }
}