package com.example.skillforgeai.ui.common

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    protected var progressBar:
            ProgressBar? = null

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
    }

    protected fun showLoading() {

        progressBar?.visibility =
            View.VISIBLE
    }

    protected fun hideLoading() {

        progressBar?.visibility =
            View.GONE
    }

    protected fun showToast(
        message: String
    ) {

        Toast.makeText(
            this,
            message,
            Toast.LENGTH_SHORT
        ).show()
    }
}