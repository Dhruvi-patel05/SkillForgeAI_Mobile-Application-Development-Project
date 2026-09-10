package com.example.skillforgeai.ui.courses

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.skillforgeai.databinding.ActivityCoursesBinding

class CoursesActivity : AppCompatActivity() {

    private lateinit var binding:
            ActivityCoursesBinding

    private val viewModel:
            CoursesViewModel by viewModels()

    override fun onCreate(
        savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityCoursesBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {

        viewModel.courses.observe(this) {

            binding.rvCourses.layoutManager =
                LinearLayoutManager(this)

            binding.rvCourses.adapter =
                CourseAdapter(it)
        }
    }
}