package net.dragoncat.product_info.datamodel

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CurrencyTest {
    @Test
    fun `show correct string`() {
        val c = Currency(100)
        assertEquals("$1.00", c.toString())
    }

    @Test
    fun `get centisimal value`() {
        val c = Currency(100)
        assertEquals(100, c.toLong())
    }

    @Test
    fun `get double value`() {
        val c = Currency(125)
        assertEquals(1.25, c.toDouble())
    }

    @Test
    fun `test division to 4 decimal places`() {
        val c = Currency(100)
        assertEquals(1.00, c.div(1))
        assertEquals(.50, c.div(2))
        assertEquals(.25, c.div(4))
        assertEquals(.125, c.div(8))
        assertEquals(.0625, c.div(16))
        assertEquals(.0312, c.div(32)) // Verify round half down on .03125 to .0312
    }
}