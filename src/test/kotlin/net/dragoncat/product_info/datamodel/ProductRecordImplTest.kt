package net.dragoncat.product_info.datamodel

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class ProductRecordImplTest {
    @Test
    fun `test default constructor`() {
        val p = ProductRecordImpl()
        assertNull(p.productId)
        assertNull(p.productDescription)
        assertNull(p.regularPrice)
        assertNull(p.promoPrice)
        assertNull(p.productFlags)
        assertNull(p.productSize)
        assertEquals("$0.00", p.regularPriceDisplay)
        assertNull(p.promotionalPriceDisplay)
        assertEquals(0.00, p.regularPriceCalculator)
        assertNull(p.promotionalPriceCalculator)
        assertEquals("Each", p.unitOfMeasure)
        assertNull(p.taxRate)
    }

    @Test
    fun `test full data`() {
        val p = ProductRecordImpl(
            productId = 1,
            productDescription = "Test product 1",
            promoPrice = SinglePrice(Currency(100)),
            regularPrice = SplitPrice(Currency(250), 2),
            productFlags = ProductFlags(mutableSetOf(Flags.PER_WEIGHT, Flags.TAXABLE)),
            productSize = "Test size"
        )
        assertEquals(1, p.productId)
        assertEquals("Test product 1", p.productDescription)
        assertEquals("Test size", p.productSize)
        assertEquals("$1.00", p.promotionalPriceDisplay)
        assertEquals("2 for $2.50", p.regularPriceDisplay)
        assertEquals(1.00, p.promotionalPriceCalculator)
        assertEquals(1.25, p.regularPriceCalculator)
        assertEquals("Pound", p.unitOfMeasure)
        assertEquals(0.07775, p.taxRate)
    }
}