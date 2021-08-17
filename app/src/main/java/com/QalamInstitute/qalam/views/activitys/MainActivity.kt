package com.QalamInstitute.qalam.views.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.QalamInstitute.qalam.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val navigationController = Navigation.findNavController(
            this,
            R.id.NevHostFragment
        )
        setupBottomNavigationMenu(navigationController)
    }




    private fun setupBottomNavigationMenu(navController: NavController) {
        bottom_navigation?.let {
            NavigationUI.setupWithNavController(it, navController)
        }
    }
}