package com.example.skillforgeai.ui.courses

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityCourseDetailsBinding

class CourseDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCourseDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCourseDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadCourseData()

        binding.imgBack.setOnClickListener {
            finish()
        }

        binding.btnEnroll.setOnClickListener {

            Toast.makeText(
                this,
                "Course Started",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun loadCourseData() {

        val title =
            intent.getStringExtra("COURSE_TITLE")
                ?: "Android Development"

        val description =
            intent.getStringExtra("COURSE_DESCRIPTION")
                ?: "Learn Android Development from Beginner to Advanced."

        binding.txtCourseTitle.text = title

        binding.txtDescription.text = description

        binding.txtInstructor.text =
            "By SkillForgeAI"

        binding.txtDuration.text =
            "Duration: 12 Weeks"

        binding.txtLessons.text =
            "Lessons: 48"
    }
}