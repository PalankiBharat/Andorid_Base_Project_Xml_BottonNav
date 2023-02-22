package com.example.andoridbaseprojectwithxmlandbottonnav.di

import android.content.Context
import com.example.andoridbaseprojectwithxmlandbottonnav.utils.network.NetworkResultCallAdapterFactory
import com.example.andoridbaseprojectwithxmlandbottonnav.utils.network.interceptors.AuthInterceptorImpl
import com.google.gson.Gson
import com.ivaninfotech.dalearts.utils.constants.EndPoints.DEVELOPMENT_BASE_URL
import com.ivaninfotech.dalearts.utils.constants.EndPoints.LIVE_BASE_URL
import com.ivaninfotech.dalearts.utils.constants.EndPoints.USE_DEVELOPMENT
import com.ivaninfotech.dalearts.utils.network.interceptors.NetworkConnectionInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(
        networkConnectionInterceptor: NetworkConnectionInterceptor,
        authInterceptor: AuthInterceptorImpl,
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(networkConnectionInterceptor)
            .addInterceptor(authInterceptor)
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(  if(USE_DEVELOPMENT) DEVELOPMENT_BASE_URL else LIVE_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(NetworkResultCallAdapterFactory.create())
            .client(okHttpClient)
            .build()
    }


    @Provides
    @Singleton
    fun provideContext(@ApplicationContext context: Context): Context = context

    @Provides
    @Singleton
    fun provideGson(): Gson = Gson()



}