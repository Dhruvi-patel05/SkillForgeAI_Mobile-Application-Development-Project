package com.example.skillforgeai.ui.placement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.skillforgeai.databinding.ActivityCompanyWisePrepBinding

class CompanyWisePrepActivity :
    AppCompatActivity() {

    private lateinit var binding:
            ActivityCompanyWisePrepBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =
            ActivityCompanyWisePrepBinding.inflate(
                layoutInflater
            )

        setContentView(binding.root)

        binding.txtCompany.text =
            """
            Google Preparation
            
            • DSA
            
            • System Design
            
            • Android
            
            • Problem Solving
            """.trimIndent()
    }
}