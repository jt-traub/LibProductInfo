package net.dragoncat.product_info.datamodel

import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class SinglePriceTest {
    @Test
    fun `display value`() {
        val p = SinglePrice(USMoney(100))
        assertEquals("$1.00", p.display())
    }

    @Test
    fun `calculator value`() {
        val p = SinglePrice(USMoney(100))
        assertEquals(1.00, p.calculatorValue())
    }
}
