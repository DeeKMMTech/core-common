package com.dee.common

import kotlinx.serialization.Serializable

/**
 * Created by Hein Htet
 */

@Serializable
data class ErrorDisplay(
    val code: String,
    override val message: String,
) : Throwable(message)