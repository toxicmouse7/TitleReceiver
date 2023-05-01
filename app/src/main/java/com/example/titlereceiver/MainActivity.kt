package com.example.titlereceiver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.internal.ContextUtils.getActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val title = intent.getStringExtra(Intent.EXTRA_TEXT)
        runOnUiThread {
            val titleView = findViewById<TextView>(R.id.titleView)
            titleView.text = title
        }
    }
}