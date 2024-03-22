package com.dee.common

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.convert
import platform.Foundation.NSNumber
import platform.Foundation.NSNumberFormatter
import platform.Foundation.NSNumberFormatterDecimalStyle

/**
 * Created by Hein Htet
 */

@OptIn(ExperimentalForeignApi::class)
actual fun Double.formatDecimal(digit: Int): String {
    return  NSNumberFormatter().apply {
        minimumFractionDigits = 0u
        maximumFractionDigits = digit.convert()
        numberStyle = NSNumberFormatterDecimalStyle
    }.stringFromNumber(number = NSNumber(double = this)) ?: ""
}
