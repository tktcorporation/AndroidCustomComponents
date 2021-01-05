package com.example.customcomponents

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.customcomponents.component.UnixEpochTextView

class SampleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        val unixEpochTextView = findViewById<UnixEpochTextView>(R.id.unix_epoch_text_view)
        val showCurrentTimeButton = findViewById<Button>(R.id.show_current_time_button)
        showCurrentTimeButton.setOnClickListener { unixEpochTextView.setUnixEpoch(System.currentTimeMillis()) }
    }
}