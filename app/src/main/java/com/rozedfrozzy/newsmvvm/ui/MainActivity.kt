package com.rozedfrozzy.newsmvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.*
import com.rozedfrozzy.newsmvvm.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
    }

    private fun setupUI() {
        setSupportActionBar(toolbar)

        navController = findNavController(R.id.nav_host_fragment)

        val config = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.businessFragment,
                R.id.entertainmentFragment,
                R.id.healthFragment,
                R.id.scienceFragment,
                R.id.sportsFragment,
                R.id.technologyFragment
            ),
            drawerLayout
        )

        navigationDrawer.setupWithNavController(navController)
        toolbar.setupWithNavController(navController, config)

    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, drawerLayout)
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START)
        else super.onBackPressed()
    }
}
