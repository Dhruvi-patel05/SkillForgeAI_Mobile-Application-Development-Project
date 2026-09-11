package com.example.skillforgeai.ui.common

import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {

    protected var progressBar:
            ProgressBar? = null

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
            requireContext(),
            message,
            Toast.LENGTH_SHORT
        ).show()
    }
}