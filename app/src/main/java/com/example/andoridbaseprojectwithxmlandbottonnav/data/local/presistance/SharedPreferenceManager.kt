package com.example.andoridbaseprojectwithxmlandbottonnav.data.local.presistance

import android.content.Context
import android.util.Log
import androidx.core.content.edit
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import javax.inject.Inject

class SharedPreferenceManager @Inject constructor(
    private val context: Context
) {

    private val masterKey = MasterKey.Builder(context)
        .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
        .build()

    private val sharedPreferences = EncryptedSharedPreferences
        .create(
            context,
            TOKEN_MANAGER_NAME,
            masterKey,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )

    fun getAccessToken(): String? = sharedPreferences.getString(TOKEN_KEY, null)

    fun saveAccessToken(token: String) {
        Log.d("TAG", "saved Token: "+token)
        sharedPreferences.edit {
            putString(TOKEN_KEY, token)
        }
    }

    fun clearToken() {
        sharedPreferences.edit {
            putString(TOKEN_KEY, null)
        }
    }


    fun setLoginStatus(is_logged_in:Boolean)
    {
        sharedPreferences.edit {
            putBoolean(IS_LOGGED_IN,is_logged_in)
        }
    }

    fun getLoginStatus():Boolean
    {
       return sharedPreferences.getBoolean(IS_LOGGED_IN,false)
    }


    companion object {
        //todo Changes names in every project
        const val TOKEN_MANAGER_NAME = "token_pref"
        const val TOKEN_KEY = "auth_token"
        const val IS_LOGGED_IN = "is_logged_in"
    }

}