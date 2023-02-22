package com.example.andoridbaseprojectwithxmlandbottonnav.ui.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<V : ViewBinding> : AppCompatActivity() {
    private lateinit var viewBinding: V
    val binding get() = viewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()

    }

    private fun init() {
        viewBinding = DataBindingUtil.setContentView(this, getLayoutResourceId())
        initView()
    }

    abstract fun getLayoutResourceId(): Int

    open fun initView() {

    }



}