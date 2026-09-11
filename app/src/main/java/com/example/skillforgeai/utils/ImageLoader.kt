package com.example.skillforgeai.utils

import android.widget.ImageView
import com.bumptech.glide.Glide

object ImageLoader {

    fun loadImage(
        imageView: ImageView,
        imageUrl: String
    ) {

        Glide.with(
            imageView.context
        )
            .load(imageUrl)
            .centerCrop()
            .into(imageView)
    }

    fun loadProfileImage(
        imageView: ImageView,
        imageUrl: String
    ) {

        Glide.with(
            imageView.context
        )
            .load(imageUrl)
            .circleCrop()
            .into(imageView)
    }
}