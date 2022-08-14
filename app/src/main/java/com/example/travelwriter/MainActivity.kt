package com.example.travelwriter

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.travelwriter.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private lateinit var drawer: DrawerLayout
    private lateinit var appBar: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<MainActivityBinding>(this, R.layout.main_activity)

        drawer = binding.drawer
        val navController = findNavController(R.id.navContainer)
        NavigationUI.setupActionBarWithNavController(this, navController, drawer)

        appBar = AppBarConfiguration(navController.graph, drawer)
        NavigationUI.setupWithNavController(binding.nav, navController)

        val prefs = this.getPreferences(Context.MODE_PRIVATE)

        val user = prefs.getString("user", null)

        if(user == null) {
            navController.navigate(R.id.action_mainFragment_to_firstTimeFragment)
        }

        navController.addOnDestinationChangedListener { nc: NavController, nd: NavDestination, args: Bundle? ->
            if (nd.id == nc.graph.startDestinationId) {
                drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
            } else {
                drawer.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
            }

            if (nd.id == R.id.firstTimeFragment) {
                supportActionBar?.setDisplayHomeAsUpEnabled(false)
                supportActionBar?.setHomeButtonEnabled(false)
            }
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.navContainer)
        return NavigationUI.navigateUp(navController, drawer)
    }


}