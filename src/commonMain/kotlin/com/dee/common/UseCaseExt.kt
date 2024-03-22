package com.dee.common


/**
 * Created by Hein Htet
 */

fun Throwable.mapToErrorDisplay(): ErrorDisplay {
    return if (this is ErrorDisplay) {
        this
    } else {
        ErrorDisplay(code = COMMON_ERROR_DISPLAY_CODE, this.message.orEmpty())
    }
}
const val COMMON_ERROR_DISPLAY_CODE = "1"