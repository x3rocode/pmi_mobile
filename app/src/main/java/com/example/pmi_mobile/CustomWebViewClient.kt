package com.example.pmi_mobile

import android.annotation.TargetApi
import android.graphics.Bitmap
import android.os.Build
import android.webkit.*

class CustomWebViewClient(val writeLog: (String) -> Unit) : WebViewClient() {
    override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
        writeLog("onPageStarted : ${url}\n")
        super.onPageStarted(view, url, favicon)
    }

    override fun onPageFinished(view: WebView?, url: String?) {
        writeLog("onPageFinished : ${url}\n")
        super.onPageFinished(view, url)
    }

    override fun onLoadResource(view: WebView?, url: String?) {
        writeLog("onLoadResource : ${url}\n")
        super.onLoadResource(view, url)
    }

    @TargetApi(Build.VERSION_CODES.M)
    override fun onReceivedError(
        view: WebView?,
        request: WebResourceRequest?,
        error: WebResourceError?
    ) {
        writeLog("onReceivedError : ${error?.description.toString()}\n")
        super.onReceivedError(view, request, error)
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    override fun shouldInterceptRequest(
        view: WebView?,
        request: WebResourceRequest?
    ): WebResourceResponse? {
        writeLog("shouldInterceptRequest : ${request?.url.toString()}\n")
        return super.shouldInterceptRequest(view, request)
    }

    @TargetApi(Build.VERSION_CODES.N)
    override fun shouldOverrideUrlLoading(
        view: WebView?,
        request: WebResourceRequest?
    ): Boolean {
        writeLog("shouldOverrideUrlLoading : ${request?.url.toString()}\n")
        return super.shouldOverrideUrlLoading(view, request)
    }
}