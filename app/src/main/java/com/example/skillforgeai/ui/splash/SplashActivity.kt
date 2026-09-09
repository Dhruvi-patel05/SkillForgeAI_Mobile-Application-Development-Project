package com.example.skillforgeai.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.skillforgeai.databinding.ActivitySplashBinding
import com.example.skillforgeai.ui.auth.LoginActivity
import com.example.skillforgeai.ui.dashboard.DashboardActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    private val viewModel: SplashViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startSplash()
    }

    private fun startSplash() {

        lifecycleScope.launch {

            delay(3000)

            if (viewModel.isUserLoggedIn()) {

                startActivity(
                    Intent(
                        this@SplashActivity,
                        DashboardActivity::class.java
                    )
                )

            } else {

                startActivity(
                    Intent(
                        this@SplashActivity,
                        LoginActivity::class.java
                    )
                )
            }

            finish()
        }
    }
}