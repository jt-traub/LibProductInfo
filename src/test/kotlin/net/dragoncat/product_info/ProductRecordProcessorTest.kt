package net.dragoncat.product_info

import net.dragoncat.product_info.datamodel.Flags
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

class ProductRecordProcessorTest {
    @Test
    fun `test parse string`() {
        val p = ProductRecordProcessor()
        val resDesc = p.parseString(singleItemTest, ProductRecordProcessor.Fields.ProductDescription)
        val resSize = p.parseString(singleItemTest, ProductRecordProcessor.Fields.ProductSize)
        assertEquals("Generic Soda 12-pack", resDesc)
        assertEquals("12x12oz", resSize)
    }

    @Test
    fun `test parse long`() {
        val p = ProductRecordProcessor()
        val res = p.parseLong(singleItemTest, ProductRecordProcessor.Fields.ProductId)
        assertEquals(14963801, res)
    }

    @Test
    fun `parse currency`() {
        val p = ProductRecordProcessor()
        val res = p.parseCurrency(singleItemTest, ProductRecordProcessor.Fields.RegularSplitPrice)
        assertEquals(13.00, res?.toDouble())
    }

    @Test
    fun `test parse negative currency value`() {
        val p = ProductRecordProcessor()
        val res = p.parseCurrency(negativeCurrencyTest, ProductRecordProcessor.Fields.PromotionalSingularPrice)
        assertEquals(-5.49, res?.toDouble())
    }


    @Test
    fun `parse price data`() {
        val p = ProductRecordProcessor()
        val res = p.parsePriceData(
            singleItemTest,
            ProductRecordProcessor.Fields.RegularForX,
            ProductRecordProcessor.Fields.RegularSingularPrice,
            ProductRecordProcessor.Fields.RegularSplitPrice
        )
        assertEquals("2 for $13.00", res?.display())
        assertEquals(6.50, res?.calculatorValue())
    }

    @Test
    fun `parse flags`() {
        val p = ProductRecordProcessor()
        val res = p.parseFlags(singleItemTest, ProductRecordProcessor.Fields.Flags)
        assertTrue(res.isSet(Flags.TAXABLE))
        assertFalse(res.isSet(Flags.PER_WEIGHT))
    }

    @Test
    fun `parse single record`() {
        val i = listOf(singleItemTest).stream()
        val p = ProductRecordProcessor()
        val res = p.getProductRecords(i)
        assertEquals(1, res.size)
        assertEquals(14963801, res[0].productId)
        assertEquals("Generic Soda 12-pack", res[0].productDescription)
        assertEquals("2 for $13.00", res[0].regularPriceDisplay)
        assertEquals(6.50, res[0].regularPriceCalculator)
        assertEquals("$5.49", res[0].promotionalPriceDisplay)
        assertEquals(5.49, res[0].promotionalPriceCalculator)
        assertEquals("Each", res[0].unitOfMeasure)
        assertEquals(0.07775, res[0].taxRate)
        assertEquals("12x12oz", res[0].productSize)
    }

    @Test
    fun `parse multiple records`() {
        val i = multipleProducts.stream()
        val p = ProductRecordProcessor()
        val res = p.getProductRecords(i)
        assertEquals(4, res.size)
        // verify each of the items in the results
        assertEquals(80000001, res[0].productId)
        assertEquals("Kimchi-flavored white rice", res[0].productDescription)
        assertEquals("$5.67", res[0].regularPriceDisplay)
        assertEquals(5.67, res[0].regularPriceCalculator)
        assertNull(res[0].promotionalPriceDisplay)
        assertNull(res[0].promotionalPriceCalculator)
        assertEquals("Each", res[0].unitOfMeasure)
        assertNull(res[0].taxRate)
        assertEquals("18oz", res[0].productSize)

        assertEquals(14963801, res[1].productId)
        assertEquals("Generic Soda 12-pack", res[1].productDescription)
        assertEquals("2 for $13.00", res[1].regularPriceDisplay)
        assertEquals(6.50, res[1].regularPriceCalculator)
        assertEquals("$5.49", res[1].promotionalPriceDisplay)
        assertEquals(5.49, res[1].promotionalPriceCalculator)
        assertEquals("Each", res[1].unitOfMeasure)
        assertEquals(.07775, res[1].taxRate)
        assertEquals("12x12oz", res[1].productSize)

        assertEquals(40123401, res[2].productId)
        assertEquals("Marlboro Cigarettes", res[2].productDescription)
        assertEquals("$10.00", res[2].regularPriceDisplay)
        assertEquals(10.00, res[2].regularPriceCalculator)
        assertEquals("$5.49", res[2].promotionalPriceDisplay)
        assertEquals(5.49, res[2].promotionalPriceCalculator)
        assertEquals("Each", res[2].unitOfMeasure)
        assertNull(res[2].taxRate)
        assertEquals("", res[2].productSize)

        assertEquals(50133333, res[3].productId)
        assertEquals("Fuji Apples (Organic)", res[3].productDescription)
        assertEquals("$3.49", res[3].regularPriceDisplay)
        assertEquals(3.49, res[3].regularPriceCalculator)
        assertNull(res[3].promotionalPriceDisplay)
        assertNull(res[3].promotionalPriceCalculator)
        assertEquals("Pound", res[3].unitOfMeasure)
        assertNull(res[3].taxRate)
        assertEquals("lb", res[3].productSize)
    }

    companion object {
        val singleItemTest =
            "14963801 Generic Soda 12-pack                                        00000000 00000549 00001300 00000000 00000002 00000000 NNNNYNNNN   12x12oz"
        val negativeCurrencyTest =
            "14963801 Generic Soda 12-pack                                        00000000 -0000549 00001300 00000000 00000002 00000000 NNNNYNNNN   12x12oz"
        val multipleProducts = listOf(
            "80000001 Kimchi-flavored white rice                                  00000567 00000000 00000000 00000000 00000000 00000000 NNNNNNNNN      18oz",
            "14963801 Generic Soda 12-pack                                        00000000 00000549 00001300 00000000 00000002 00000000 NNNNYNNNN   12x12oz",
            "40123401 Marlboro Cigarettes                                         00001000 00000549 00000000 00000000 00000000 00000000 YNNNNNNNN          ",
            "50133333 Fuji Apples (Organic)                                       00000349 00000000 00000000 00000000 00000000 00000000 NNYNNNNNN        lb"
        )
    }
}