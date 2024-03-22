package com.dee.common

import java.text.DecimalFormat

/**
 * Created by Hein Htet
 */
actual fun Double.formatDecimal(digit: Int): String {
    return DecimalFormat().apply {
        isGroupingUsed = false
        minimumFractionDigits = 0
        maximumFractionDigits = digit
        isDecimalSeparatorAlwaysShown = false
    }.format(this)
}