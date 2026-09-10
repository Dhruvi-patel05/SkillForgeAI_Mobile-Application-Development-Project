package com.example.skillforgeai.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.skillforgeai.databinding.ActivityOnboardingBinding
import com.example.skillforgeai.ui.auth.LoginActivity

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    private val viewModel: OnboardingViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityOnboardingBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        setupViewPager()

        setupListeners()
    }

    private fun setupViewPager() {

        viewModel.onboardingItems.observe(this) { list ->

            binding.viewPagerOnboarding.adapter = OnboardingAdapter(list)
        }

        binding.viewPagerOnboarding.registerOnPageChangeCallback(

            object : ViewPager2.OnPageChangeCallback() {

                override fun onPageSelected(
                    position: Int
                ) {

                    super.onPageSelected(position)

                    if (position == 2) {

                        binding.btnNext.text =
                            "Get Started"

                    } else {

                        binding.btnNext.text =
                            "Next"
                    }
                }
            }
        )
    }

    private fun setupListeners() {

        binding.btnNext.setOnClickListener {

            val currentPosition =
                binding.viewPagerOnboarding.currentItem

            if (currentPosition < 2) {

                binding.viewPagerOnboarding.currentItem =
                    currentPosition + 1

            } else {

                navigateToLogin()
            }
        }

        binding.txtSkip.setOnClickListener {

            navigateToLogin()
        }
    }

    private fun navigateToLogin() {

        startActivity(
            Intent(
                this,
                LoginActivity::class.java
            )
        )

        finish()
    }
}