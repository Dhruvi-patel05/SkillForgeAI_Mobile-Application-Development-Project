package com.example.skillforgeai.ui.courses

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.skillforgeai.data.model.Course
import com.example.skillforgeai.databinding.ItemCourseBinding

class CourseAdapter(
    private val courseList: List<Course>
) : RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    inner class CourseViewHolder(
        private val binding: ItemCourseBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(course: Course) {

            binding.txtCourseName.text = course.title

            binding.txtCourseDescription.text = course.description

            binding.progressCourse.progress = course.progress

            binding.root.setOnClickListener {

                val intent = Intent(
                    binding.root.context,
                    CourseDetailsActivity::class.java
                )

                intent.putExtra(
                    "COURSE_TITLE",
                    course.title
                )

                intent.putExtra(
                    "COURSE_DESCRIPTION",
                    course.description
                )

                binding.root.context.startActivity(
                    intent
                )
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CourseViewHolder {

        val binding =
            ItemCourseBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )

        return CourseViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: CourseViewHolder,
        position: Int
    ) {

        holder.bind(courseList[position])
    }

    override fun getItemCount(): Int {
        return courseList.size
    }
}