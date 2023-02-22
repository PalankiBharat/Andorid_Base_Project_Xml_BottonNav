package com.example.andoridbaseprojectwithxmlandbottonnav.utils

import android.Manifest
import android.app.Dialog
import android.content.Intent
import android.content.res.Resources
import android.graphics.Rect
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.example.andoridbaseprojectwithxmlandbottonnav.ui.activity.MainActivity
import com.google.android.material.snackbar.Snackbar
import com.ivaninfotech.dalearts.utils.constants.Constants
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest
import pub.devrel.easypermissions.EasyPermissions


fun Fragment.makeToast(text: String) {
    Snackbar.make(
        requireView(),
        text,
        Snackbar.LENGTH_SHORT
    ).show()
}


fun Fragment.makeToast(@StringRes res: Int) {
    Snackbar.make(
        requireView(),
        res,
        Snackbar.LENGTH_SHORT
    ).show()
}

fun Fragment.snackBar(text: String) {
    Toast.makeText(
        requireContext(),
        text,
        Toast.LENGTH_SHORT
    ).show()
}

fun Fragment.snackBar(@StringRes res: Int) {
    Toast.makeText(
        requireContext(),
        res,
        Toast.LENGTH_SHORT
    ).show()
}

fun <T> Fragment.collectLatestLifeCycleFlow(
    flow: Flow<T>,
    collect: suspend (T) -> Unit
) {
    viewLifecycleOwner.lifecycleScope.launchWhenStarted {
        repeatOnLifecycle(Lifecycle.State.STARTED) {
            flow.collectLatest(collect)
        }
    }
}


fun View.makeVisible()
{
    this.visibility = View.VISIBLE
}
fun View.makeInVisible()
{
    this.visibility = View.INVISIBLE
}
fun View.makeGone()
{
    this.visibility = View.GONE
}
/*
fun Fragment.showLoading()
{
    (requireActivity() as MainActivity).showLoading()

}

fun Fragment.stopLoading()
{
    (requireActivity() as MainActivity).stopLoading()

}*/

fun String?.isSuccess():Boolean{
    return this=="success"
}


fun EditText.getString():String{
    return this.text.toString()
}


fun Fragment.callWithReadPermission(startPicker:()->Unit)
{
    if (EasyPermissions.hasPermissions(requireContext(),
            Manifest.permission.READ_EXTERNAL_STORAGE
        )) {
       startPicker()
    }
    else{
        EasyPermissions.requestPermissions(
            requireActivity(),
            "Our App Requires a permission to access your storage",
            Constants.FILE_PERMISSION_REQ_CODE,
            Manifest.permission.READ_EXTERNAL_STORAGE
        )
    }
}
fun Fragment.callWithCameraPermission(startPicker:()->Unit)
{
    if (EasyPermissions.hasPermissions(requireContext(),
            Manifest.permission.CAMERA
        )) {
        startPicker()
    }
    else{
        EasyPermissions.requestPermissions(
            requireActivity(),
            "Our App Requires a permission to access your camera",
            Constants.CAMERA_PERMISSION_REQ_CODE,
            Manifest.permission.CAMERA
        )

    }
}

fun Fragment.selectImage(startPickerResult :ActivityResultLauncher<Intent>)
{
    callWithReadPermission {
        val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
        intent.addCategory(Intent.CATEGORY_OPENABLE)
        intent.type = "image/*"
        startPickerResult.launch(intent)
    }
}

fun Dialog.setWidthPercent(percentage: Int) {
    val percent = percentage.toFloat() / 100
    val dm = Resources.getSystem().displayMetrics
    val rect = dm.run { Rect(0, 0, widthPixels, heightPixels) }
    val percentWidth = rect.width() * percent
    this.window?.setLayout(percentWidth.toInt(), ViewGroup.LayoutParams.WRAP_CONTENT)
}

fun Dialog.setHeightWidthPercent(percentageWidth: Int, percentageHeight:Int) {
    val percent = percentageWidth.toFloat() / 100
    val percentH = percentageHeight.toFloat() / 100
    val dm = Resources.getSystem().displayMetrics
    val rect = dm.run { Rect(0, 0, widthPixels, heightPixels) }
    val percentWidth = rect.width() * percent
    val percentHeight = rect.height() * percentH
    this.window?.setLayout(percentWidth.toInt(), percentHeight.toInt())
}



