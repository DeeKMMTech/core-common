package com.dee.common

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals


/**
 * Created by Hein Htet
 */

class DateExtTest {

    @Test
    fun verifyGivenDateReturnTrue() {
        val date = getFormattedDate("2024-03-08", "yyyy-MM-dd", "MMM dd,yyyy")
        assertEquals("Mar 08,2024", date)
    }

    @Test
    fun verifyGivenDateReturnFalse() {
        val date = getFormattedDate("2024-03-08", "yyyy-MM-dd", "dd MMM,yyyy")
        assertNotEquals("Mar 08,2024", date)
    }
}