package com.example.customcomponents.component

import android.content.res.Resources
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View

// boolean
fun View.getBooleanAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Boolean,
    callback: (Boolean) -> Unit
): Boolean = getBooleanAttr(attrs, styleable, index, defValue).apply(callback)

fun View.getBooleanAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (Boolean) -> Unit
): Boolean = getBooleanAttr(attrs, styleable, index).apply(callback)

fun View.getNullableBooleanAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (Boolean?) -> Unit
): Boolean? = getNullableBooleanAttr(attrs, styleable, index).apply(callback)

fun View.getBooleanAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Boolean
): Boolean = getNullableBooleanAttrInternal(attrs, styleable, index, defValue)!!

fun View.getBooleanAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): Boolean =
    getNullableBooleanAttrInternal(attrs, styleable, index, null)
        ?: throw AttributeValueNotFoundException()

fun View.getNullableBooleanAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): Boolean? =
    getNullableBooleanAttrInternal(attrs, styleable, index, null)

// integer
fun View.getIntegerAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Int,
    callback: (Int) -> Unit
): Int = getIntegerAttr(attrs, styleable, index, defValue).apply(callback)

fun View.getIntegerAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (Int) -> Unit
): Int = getIntegerAttr(attrs, styleable, index).apply(callback)

fun View.getNullableIntegerAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (Int?) -> Unit
): Int? = getNullableIntegerAttr(attrs, styleable, index).apply(callback)

fun View.getIntegerAttr(attrs: AttributeSet?, styleable: IntArray, index: Int, defValue: Int): Int =
    getNullableIntegerAttrInternal(attrs, styleable, index, defValue)!!

fun View.getIntegerAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): Int =
    getNullableIntegerAttrInternal(attrs, styleable, index, null)
        ?: throw AttributeValueNotFoundException()

fun View.getNullableIntegerAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): Int? =
    getNullableIntegerAttrInternal(attrs, styleable, index, null)

// float
fun View.getFloatAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Float,
    callback: (Float) -> Unit
): Float = getFloatAttr(attrs, styleable, index, defValue).apply(callback)

fun View.getFloatAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (Float) -> Unit
): Float = getFloatAttr(attrs, styleable, index).apply(callback)

fun View.getNullableFloatAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (Float?) -> Unit
): Float? = getNullableFloatAttr(attrs, styleable, index).apply(callback)

fun View.getFloatAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Float
): Float = getNullableFloatAttrInternal(attrs, styleable, index, defValue)!!

fun View.getFloatAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): Float =
    getNullableFloatAttrInternal(attrs, styleable, index, null)
        ?: throw AttributeValueNotFoundException()

fun View.getNullableFloatAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): Float? =
    getNullableFloatAttrInternal(attrs, styleable, index, null)

// string
fun View.getStringAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: String,
    callback: (String) -> Unit
): String = getStringAttr(attrs, styleable, index, defValue).apply(callback)

fun View.getStringAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (String) -> Unit
): String = getStringAttr(attrs, styleable, index).apply(callback)

fun View.getNullableStringAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (String?) -> Unit
): String? = getNullableStringAttr(attrs, styleable, index).apply(callback)

fun View.getStringAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: String
): String = getNullableStringAttrInternal(attrs, styleable, index, defValue)!!

fun View.getStringAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): String =
    getNullableStringAttrInternal(attrs, styleable, index, null)
        ?: throw AttributeValueNotFoundException()

fun View.getNullableStringAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): String? =
    getNullableStringAttrInternal(attrs, styleable, index, null)

// integer array
fun View.getIntegerArrayAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: IntArray,
    callback: (IntArray) -> Unit
): IntArray = getIntegerArrayAttr(attrs, styleable, index, defValue).apply(callback)

fun View.getIntegerArrayAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (IntArray) -> Unit
): IntArray = getIntegerArrayAttr(attrs, styleable, index).apply(callback)

fun View.getNullableIntegerArrayAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (IntArray?) -> Unit
): IntArray? = getNullableIntegerArrayAttr(attrs, styleable, index).apply(callback)

fun View.getIntegerArrayAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: IntArray
): IntArray = getNullableIntegerArrayAttrInternal(attrs, styleable, index, defValue)!!

fun View.getIntegerArrayAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): IntArray =
    getNullableIntegerArrayAttrInternal(attrs, styleable, index, null)
        ?: throw AttributeValueNotFoundException()

fun View.getNullableIntegerArrayAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int
): IntArray? = getNullableIntegerArrayAttrInternal(attrs, styleable, index, null)

// string array
fun View.getStringArrayAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Array<String>,
    callback: (Array<String>) -> Unit
): Array<String> = getStringArrayAttr(attrs, styleable, index, defValue).apply(callback)

fun View.getStringArrayAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (Array<String>) -> Unit
): Array<String> = getStringArrayAttr(attrs, styleable, index).apply(callback)

fun View.getNullableStringArrayAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (Array<String>?) -> Unit
): Array<String>? = getNullableStringArrayAttr(attrs, styleable, index).apply(callback)

fun View.getStringArrayAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Array<String>
): Array<String> = getNullableStringArrayAttrInternal(attrs, styleable, index, defValue)!!

fun View.getStringArrayAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): Array<String> =
    getNullableStringArrayAttrInternal(attrs, styleable, index, null)
        ?: throw AttributeValueNotFoundException()

fun View.getNullableStringArrayAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int
): Array<String>? = getNullableStringArrayAttrInternal(attrs, styleable, index, null)

// long by string
fun View.getLongAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Long,
    callback: (Long) -> Unit
): Long = getLongAttr(attrs, styleable, index, defValue).apply(callback)

fun View.getLongAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (Long) -> Unit
): Long = getLongAttr(attrs, styleable, index).apply(callback)

fun View.getNullableLongAttr(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    callback: (Long?) -> Unit
): Long? = getNullableLongAttr(attrs, styleable, index).apply(callback)

fun View.getLongAttr(attrs: AttributeSet?, styleable: IntArray, index: Int, defValue: Long): Long =
    getStringAttr(attrs, styleable, index, defValue.toString()).toLong()

fun View.getLongAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): Long =
    getStringAttr(attrs, styleable, index).toLong()

fun View.getNullableLongAttr(attrs: AttributeSet?, styleable: IntArray, index: Int): Long? =
    getNullableStringAttr(attrs, styleable, index)?.toLong()

// internal non-array
private fun View.getNullableBooleanAttrInternal(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Boolean?
): Boolean? = getNullableAttrInternal(
    attrs,
    styleable,
    index,
    defValue
) { typedArray: TypedArray -> typedArray.getBoolean(index, DUMMY_BOOLEAN) }

private fun View.getNullableIntegerAttrInternal(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Int?
): Int? = getNullableAttrInternal(
    attrs,
    styleable,
    index,
    defValue
) { typedArray: TypedArray -> typedArray.getInteger(index, DUMMY_INT) }

private fun View.getNullableFloatAttrInternal(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Float?
): Float? = getNullableAttrInternal(
    attrs,
    styleable,
    index,
    defValue
) { typedArray: TypedArray -> typedArray.getFloat(index, DUMMY_FLOAT) }

private fun View.getNullableStringAttrInternal(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: String?
): String? = getNullableAttrInternal(
    attrs,
    styleable,
    index,
    defValue
) { typedArray: TypedArray -> typedArray.getString(index) }

private fun View.getNullableReferenceAttrInternal(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Int?
): Int? = getNullableAttrInternal(
    attrs,
    styleable,
    index,
    defValue
) { typedArray: TypedArray -> typedArray.getResourceId(index, DUMMY_INT) }

// internal array
private fun View.getNullableIntegerArrayAttrInternal(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: IntArray?
): IntArray? = getNullableArrayAttrInternal(
    attrs,
    styleable,
    index,
    defValue
) { resources, resId -> resources.getIntArray(resId) }

private fun View.getNullableStringArrayAttrInternal(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: Array<String>?
): Array<String>? = getNullableArrayAttrInternal(
    attrs,
    styleable,
    index,
    defValue
) { resources, resId -> resources.getStringArray(resId) }

// @formatter:on

private fun <T> View.getNullableAttrInternal(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: T?,
    getValue: (TypedArray) -> T?
): T? =
    when (attrs) {
        null -> defValue
        else -> context.theme.obtainStyledAttributes(attrs, styleable, 0, 0).run {
            try {
                when {
                    !hasValue(index) -> defValue
                    else -> getValue(this)
                }
            } finally {
                recycle()
            }
        }
    }

private fun <T> View.getNullableArrayAttrInternal(
    attrs: AttributeSet?,
    styleable: IntArray,
    index: Int,
    defValue: T?,
    getValue: (Resources, Int) -> T?
): T? =
    when (val resId: Int? = getNullableReferenceAttrInternal(attrs, styleable, index, null)) {
        null -> defValue
        else -> getValue(resources, resId)
    }

class AttributeValueNotFoundException :
    IllegalStateException("This attr must be set. Please set attr in layout file or set default value")

private const val DUMMY_BOOLEAN: Boolean = false
private const val DUMMY_INT: Int = 0
private const val DUMMY_FLOAT: Float = 0f