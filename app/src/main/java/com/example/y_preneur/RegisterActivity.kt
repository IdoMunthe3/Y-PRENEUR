package com.example.y_preneur

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.HomeActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val homepageBtn: Button = findViewById (R.id.btn_create)

        homepageBtn.setOnClickListener() {
            val intent = Intent(this@RegisterActivity, HomeActivity::class.java)
            startActivity(intent)
        }

    }
}