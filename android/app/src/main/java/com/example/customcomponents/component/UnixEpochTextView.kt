package com.example.customcomponents.component

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.example.customcomponents.R
import java.text.SimpleDateFormat
import java.util.*

class UnixEpochTextView : AppCompatTextView {
    constructor(context: Context) : super(context) {
        initAttrs(null)
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        initAttrs(attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initAttrs(attrs)
    }

    private fun initAttrs(attrs: AttributeSet?) {
        getLongAttr(attrs, R.styleable.UnixEpochTextView, R.styleable.UnixEpochTextView_unixEpoch, 0, this::setUnixEpoch)
    }

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