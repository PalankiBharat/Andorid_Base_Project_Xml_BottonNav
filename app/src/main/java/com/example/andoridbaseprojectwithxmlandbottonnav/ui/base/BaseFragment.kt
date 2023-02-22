package com.example.andoridbaseprojectwithxmlandbottonnav.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding


abstract class BaseFragment< V : ViewBinding> : Fragment() {

    private lateinit var _viewBinding: V
    protected val binding get() = _viewBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        init(container)
        return _viewBinding.root
    }

    private fun init(container: ViewGroup?) {
        _viewBinding = DataBindingUtil.inflate(layoutInflater, getLayoutResourceId(), container, false)
        initView()
        observe()
    }

    abstract fun getLayoutResourceId(): Int


    open fun initView() {

    }

    open fun observe()
    {

    }


}