package com.ivaninfotech.dalearts.utils.constants

import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey

object ProfileStoreKeys {
    val id = stringPreferencesKey(name = "user_id")
    val firstName = stringPreferencesKey(name = "firstName")
    val lastName = stringPreferencesKey(name = "lastName")
    val phone = stringPreferencesKey(name = "user_phone")
    val email = stringPreferencesKey(name = "email")
    val username = stringPreferencesKey(name = "username")
    val status = stringPreferencesKey(name = "status")
    val mainWallet = floatPreferencesKey(name = "mainWallet")
    val profilePicture = stringPreferencesKey(name = "profilePicture")
    val profilePicturePath = stringPreferencesKey(name = "profilePicturePath")
    val coverImage = stringPreferencesKey(name = "coverImage")
    val coverImagePath = stringPreferencesKey(name = "coverImagePath")
    val role = stringPreferencesKey(name = "role")
    val bio = stringPreferencesKey(name = "bio")
}