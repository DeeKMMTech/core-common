package com.dee.common

import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter

actual fun getFormattedDate(date: String, inputFormat: String, outputFormat: String): String {
    val inputFormatter = DateTimeFormatter.ofPattern(inputFormat)
    val localDate = LocalDate.parse(date,inputFormatter)
    val formatter = DateTimeFormatter.ofPattern(outputFormat)
    return localDate.format(formatter) ?: ""
}