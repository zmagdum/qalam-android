package com.QalamInstitute.qalam.views.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.lifecycleScope
import com.QalamInstitute.qalam.R
import kotlinx.coroutines.delay

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)


        lifecycleScope.launchWhenCreated {
           delay(3000)

            val nextActivityIntent=Intent(this@SplashScreenActivity,MainActivity::class.java)
            startActivity(nextActivityIntent)
            finish()
        }
    }
}