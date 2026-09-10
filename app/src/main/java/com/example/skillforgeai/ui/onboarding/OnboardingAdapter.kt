package com.example.skillforgeai.ui.onboarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skillforgeai.data.model.OnboardingItem
import com.example.skillforgeai.databinding.ItemOnboardingBinding

class OnboardingAdapter(
    private val itemList: List<OnboardingItem>
) : RecyclerView.Adapter<OnboardingAdapter.OnboardingViewHolder>() {

    inner class OnboardingViewHolder(
        private val binding: ItemOnboardingBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: OnboardingItem) {

            binding.imgOnboarding.setImageResource(
                item.imageRes
            )

            binding.txtTitle.text =
                item.title

            binding.txtDescription.text =
                item.description
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): OnboardingViewHolder {

        val binding =
            ItemOnboardingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )

        return OnboardingViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: OnboardingViewHolder,
        position: Int
    ) {

        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}