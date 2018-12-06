package com.example.vigneshwar.arthumtrust

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        webview.webViewClient = MyWebViewClient()
        webview.settings.javaScriptEnabled = true

        webview.settings.javaScriptCanOpenWindowsAutomatically = true

            webview.loadUrl("https://arthamtrust.org" )


    }

    @Suppress("OverridingDeprecatedMember")
    class MyWebViewClient : WebViewClient(){

        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
            view?.loadUrl(request?.url.toString())
            return true
        }

        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
            view?.loadUrl(url)
            return true
        }

    }

    override fun onBackPressed() {
        if (webview.canGoBack()) {
            webview.goBack()
        } else {
            // Otherwise defer to system default behavior.
            super.onBackPressed()
        }

}

}

