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
import com.example.andoridbaseprojectwithxmlandbottonnav.databinding.FragmentShopBinding
import com.example.andoridbaseprojectwithxmlandbottonnav.databinding.FragmentSplashBinding
import com.example.andoridbaseprojectwithxmlandbottonnav.ui.base.BaseActivity
import com.example.andoridbaseprojectwithxmlandbottonnav.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay

@AndroidEntryPoint
class ShopFragment : BaseFragment<FragmentShopBinding>() {

    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_shop
    }

    override fun initView() {
        super.initView()

    }


}