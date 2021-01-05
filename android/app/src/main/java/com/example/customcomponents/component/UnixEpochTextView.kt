package com.example.customcomponents.component

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import java.text.SimpleDateFormat
import java.util.*

class UnixEpochTextView : AppCompatTextView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    fun setUnixEpoch(unixEpoch: Long) {
        text = unixEpoch.unixEpochString
    }

    companion object {
        private val Long.unixEpochString: String
            get() = SimpleDateFormat("yyyy-MM-dd\nHH:mm:ss.SSS", Locale.US)
                .apply { timeZone = TimeZone.getTimeZone("Asia/Tokyo") }
                .format(Date(this))
    }
}