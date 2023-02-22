package com.ivaninfotech.dalearts.utils.downloaders

interface Downloader {
    fun downloadFile(url: String): Long
}