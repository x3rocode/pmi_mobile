package com.example.pmi_mobile

import android.os.Bundle
import android.os.Handler
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.example.pmi_mobile.databinding.ActivityWebveiwBinding


class WebViewActivity: AppCompatActivity() {
    private val handler = Handler()
    private lateinit var binding: ActivityWebveiwBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebveiwBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.run {
            //webViewClient = CustomWebViewClient()
            loadUrl("https://m.pmi-korea.com")
        }
    }

}