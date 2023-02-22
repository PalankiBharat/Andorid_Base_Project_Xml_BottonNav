package com.example.andoridbaseprojectwithxmlandbottonnav.utils.network

import android.util.Log
import retrofit2.HttpException
import retrofit2.Response

fun <T : Any> handleApi(
    execute: () -> Response<T>
): NetworkResult<T> {
    return try {
        val response = execute()
        val body = response.body()
        if (response.isSuccessful && body != null) {
            NetworkResult.Success(body)
        } else {

       /*     Timber.d("Error Body : ${response.errorBody().toString()}")
            Timber.d("Api Error: ${response.message()} with code: ${response.code()} ")
            return if (response.errorBody() != null) {
                val type = object : TypeToken<BasicApiResponse<Unit>>() {}.type
                val errorResponse: BasicApiResponse<Unit> =
                    GsonSingleton().fromJson(response.errorBody()!!.string(), type)
                NetworkResult.Error(code = response.code(), message = errorResponse.message)
            } else {
                NetworkResult.Error(code = response.code(), message = response.message())
            }*/
            NetworkResult.Error(code = response.code(), message = response.message())

        }
    } catch (e: HttpException) {
        Log.d("HandleApi","Http Exception : $e with message ${e.message}")
        NetworkResult.Error(code = e.code(), message = e.message())
    } catch (e: Throwable) {
        Log.d("HandleApi","Exception : $e with message ${e.message}")
        NetworkResult.Exception(e)
    } catch (e: NoConnectivityException)
    {
        Log.d("HandleApi","Exception : $e with message ${e.message}")
        NetworkResult.Exception(e)
    }

}