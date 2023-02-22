package com.example.andoridbaseprojectwithxmlandbottonnav.data.remote.api

import com.example.andoridbaseprojectwithxmlandbottonnav.data.remote.response.ResponseModel
import com.example.andoridbaseprojectwithxmlandbottonnav.utils.network.NetworkResult
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface BasicApiInterface {

    // This is for multipart type request i.e for sending images and files.
    @POST("/endpoint")
    suspend fun sendMultipartRequest(@Body body: RequestBody): NetworkResult<ResponseModel>

    // This is for raw json type request
    @POST("/endpoint")
    suspend fun sendPostRequest(@Body body: ResponseModel): NetworkResult<ResponseModel>

    // This is for get type request
    @GET("/endpoint")
    suspend fun getData(): NetworkResult<ResponseModel>
}