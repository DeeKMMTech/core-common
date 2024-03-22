package com.dee.common

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Created by Hein Htet
 */
class NumberExtKtTest {

    @Test
    fun verifyFormatDisplayTimeDuration() {
        val result = 90.formatDuration()
        assertEquals("1 hr 30 mins", result)
    }

    @Test
    fun verifyDisplayFormatDecimal() {
        val result = 24.24.formatDecimal(1)
        assertEquals("24.2", result)
    }
}