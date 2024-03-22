package com.dee.common

expect fun getFormattedDate(
    date: String,
    inputFormat: String,
    outputFormat: String
): String