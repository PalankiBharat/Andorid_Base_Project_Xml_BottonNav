package com.example.andoridbaseprojectwithxmlandbottonnav.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.andoridbaseprojectwithxmlandbottonnav.R
import com.example.andoridbaseprojectwithxmlandbottonnav.databinding.ActivityMainBinding
import com.example.andoridbaseprojectwithxmlandbottonnav.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    private lateinit var navController: NavController

    override fun getLayoutResourceId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        super.initView()

        // ======== Connecting Nav graph to Fragment
        //navController = findNavController(R.id.navHostFragment)
        val navHostFrag = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFrag.navController



        // ==== Connection Bottom Navigation to nav Graph ========
        binding.bottomNavigation.setupWithNavController(navController)



        // ======== Hiding and Un-Hiding toolbar and bottom nav according to Destination ========
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.splashFragment
                -> {
                    binding.bottomNavigation.visibility = View.GONE
                    binding.toolbar.visibility = View.GONE
                }
                R.id.myProfileFragment-> {
                    binding.toolbar.visibility = View.GONE
                    binding.bottomNavigation.visibility = View.VISIBLE
                }
                else -> {
                    binding.bottomNavigation.visibility = View.VISIBLE
                    binding.toolbar.visibility = View.VISIBLE
                }
            }
        }
    }


}