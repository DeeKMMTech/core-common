package com.dee.common

/**
 * Created by Hein Htet
 */

expect fun Double.formatDecimal(digit: Int): String

fun Int.formatDuration(): String {
    val minutes = this
    val hours = minutes / 60
    val remainingMinutes = minutes % 60
    return when {
        hours == 1 && remainingMinutes == 1 -> "$hours hr $remainingMinutes min"
        hours == 1 && remainingMinutes != 1 -> "$hours hr $remainingMinutes mins"
        hours != 1 && remainingMinutes == 1 -> "$hours hrs $remainingMinutes min"
        else -> "$hours hrs $remainingMinutes mins"
    }
}