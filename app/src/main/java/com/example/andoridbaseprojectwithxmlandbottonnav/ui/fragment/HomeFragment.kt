package com.example.andoridbaseprojectwithxmlandbottonnav.ui.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.andoridbaseprojectwithxmlandbottonnav.R
import com.example.andoridbaseprojectwithxmlandbottonnav.databinding.ActivityMainBinding
import com.example.andoridbaseprojectwithxmlandbottonnav.databinding.FragmentHomeBinding
import com.example.andoridbaseprojectwithxmlandbottonnav.databinding.FragmentSplashBinding
import com.example.andoridbaseprojectwithxmlandbottonnav.ui.base.BaseActivity
import com.example.andoridbaseprojectwithxmlandbottonnav.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_home
    }

    override fun initView() {
        super.initView()
    }


}