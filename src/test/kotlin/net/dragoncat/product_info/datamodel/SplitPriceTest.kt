package net.dragoncat.product_info.datamodel

import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class SplitPriceTest {
    @Test
    fun `display value`() {
        val p = SplitPrice(USMoney(100), 3)
        assertEquals("3 for $1.00", p.display())
    }

    @Test
    fun `calculator value`() {
        val p = SplitPrice(USMoney(100), 3)
        assertEquals(.3333, p.calculatorValue())
    }

    @Test
    fun `split price rounding`() {
        val p = SplitPrice(USMoney(100), 32)
        assertEquals(.0312, p.calculatorValue())
    }
}
