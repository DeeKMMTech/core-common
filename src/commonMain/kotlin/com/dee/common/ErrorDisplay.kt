package com.dee.common

/**
 * Created by Hein Htet
 */
data class ErrorDisplay(
    val code: String,
    override val message: String,
) : Throwable(message)