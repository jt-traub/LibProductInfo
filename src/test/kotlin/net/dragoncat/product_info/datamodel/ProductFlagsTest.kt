package net.dragoncat.product_info.datamodel

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ProductFlagsTest {
    @Test
    fun `test default constructor`() {
        val expected = setOf(Flags.UNKNOWN1, Flags.PER_WEIGHT, Flags.UNKNOWN4)
        val f = ProductFlags(expected.toMutableSet())
        assertEquals(expected, f.toSet())
    }

    @Test
    fun `parse flags from string`() {
        val expected = setOf(Flags.UNKNOWN1, Flags.PER_WEIGHT, Flags.UNKNOWN4)
        val f = ProductFlags.parse("YNYY")
        assertEquals(expected, f.toSet())
    }

    @Test
    fun `convert to bitfield as long`() {
        val f = ProductFlags.parse("YNYY")
        assertEquals(13, f.toLong())
    }

    @Test
    fun `convert from long as bitfield`() {
        val expected = setOf(Flags.UNKNOWN1, Flags.PER_WEIGHT, Flags.UNKNOWN4)
        val f = ProductFlags.fromLong(13)
        assertEquals(expected, f.toSet())
    }

    @Test
    fun `verify isSet`() {
        val f = ProductFlags.parse("YNYY")
        assertTrue(f.isSet(Flags.PER_WEIGHT))
        assertFalse(f.isSet(Flags.TAXABLE))
    }

    @Test
    fun `verify toString`() {
        val f = ProductFlags(setOf(Flags.UNKNOWN1, Flags.PER_WEIGHT, Flags.UNKNOWN4))
        assertEquals("YNYYNNNNN", f.toString())
    }
}
