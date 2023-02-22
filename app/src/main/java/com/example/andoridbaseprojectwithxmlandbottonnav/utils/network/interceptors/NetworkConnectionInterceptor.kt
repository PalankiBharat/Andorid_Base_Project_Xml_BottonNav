package com.ivaninfotech.dalearts.utils.network.interceptors

import android.content.Context
import com.example.andoridbaseprojectwithxmlandbottonnav.utils.network.NoConnectivityException
import com.example.andoridbaseprojectwithxmlandbottonnav.utils.network.checkForInternetConnection
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class NetworkConnectionInterceptor @Inject constructor(
    private val context: Context
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!context.checkForInternetConnection()) throw NoConnectivityException()
        val builder = chain.request().newBuilder()
        return chain.proceed(builder.build())
    }
}