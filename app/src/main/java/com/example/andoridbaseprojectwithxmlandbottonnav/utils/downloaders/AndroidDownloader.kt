package com.ivaninfotech.dalearts.utils.downloaders

import android.app.DownloadManager
import android.content.Context
import android.database.Cursor
import android.os.Environment
import android.util.Log
import android.webkit.MimeTypeMap
import androidx.core.net.toUri
import java.lang.Exception
import java.net.URLEncoder

class AndroidDownloader (
    private val context: Context
): Downloader {

    private val downloadManager = context.getSystemService(DownloadManager::class.java)
    var finishDownload = false

    override fun downloadFile(url: String): Long {
        return try {
            val request = DownloadManager.Request(url.toUri())
                .setMimeType(getExtension(url))
                .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                .setAllowedOverMetered(true)
                .setAllowedOverRoaming(true)
                .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS,  url.substring( url.lastIndexOf('/')+1))
                .setTitle("The Arts Deal File Download")
            downloadManager.enqueue(request)
        }catch (e:Exception) {
            Log.d("TAG", "downloadFile: "+e.localizedMessage)
            -100L
        }


    }

    private fun getExtension(fileName: String): String {
        val encoded: String = try {
            URLEncoder.encode(fileName, "UTF-8").replace("+", "%20")
        } catch (e: Exception) {
            fileName
        }

        return MimeTypeMap.getFileExtensionFromUrl(encoded).toLowerCase()
    }


}

