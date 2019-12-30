package net.dragoncat.product_info.datamodel

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PriceDataTest {
    @Test
    fun `singular display value`() {
        val p = PriceData(Currency(100))
        assertEquals("$1.00", p.display())
    }

    @Test
    fun `split display value`() {
        val p = PriceData(Currency(100), 3)
        assertEquals("3 for $1.00", p.display())
    }

    @Test
    fun `singular calculator value`() {
        val p = PriceData(Currency(100))
        assertEquals(1.00, p.calculatorValue())
    }

    @Test
    fun `split calculator value`() {
        val p = PriceData(Currency(100), 3)
        assertEquals(.3333, p.calculatorValue())
    }
}