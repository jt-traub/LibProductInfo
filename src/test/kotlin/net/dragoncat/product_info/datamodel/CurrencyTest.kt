package net.dragoncat.product_info.datamodel

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CurrencyTest {
    @Test
    fun `show correct string`() {
        val c = Currency(100)
        assertEquals("$1.00", c.toString())
    }
}