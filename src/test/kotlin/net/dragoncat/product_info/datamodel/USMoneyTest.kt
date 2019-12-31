package net.dragoncat.product_info.datamodel

import java.math.BigDecimal
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class USMoneyTest {
    @Test
    fun `show correct string`() {
        val c = USMoney(100)
        assertEquals("$1.00", c.toString())
    }

    @Test
    fun `test conversion to BigDecimal`() {
        val c = USMoney(100).toBigDecimal()
        assertEquals(BigDecimal.valueOf(100, 2), c)
    }
}
