package com.example.andoridbaseprojectwithxmlandbottonnav.di

import com.example.andoridbaseprojectwithxmlandbottonnav.data.remote.api.BasicApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun provideAuthApiService(
        retrofit: Retrofit
    ): BasicApiInterface = retrofit.create(BasicApiInterface::class.java)

}