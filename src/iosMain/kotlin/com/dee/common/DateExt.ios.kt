package com.dee.common

import platform.Foundation.NSDateFormatter

actual fun getFormattedDate(date: String, inputFormat : String, outputFormat: String): String {
    val dateFormatterGet = NSDateFormatter()
    dateFormatterGet.dateFormat = inputFormat

    val dateFormatterPrint = NSDateFormatter()
    dateFormatterPrint.dateFormat = outputFormat

    val formattedDate = dateFormatterGet.dateFromString(date)
    return if (formattedDate != null) {
        dateFormatterPrint.stringFromDate(formattedDate)
    } else {
        date
    }
}
