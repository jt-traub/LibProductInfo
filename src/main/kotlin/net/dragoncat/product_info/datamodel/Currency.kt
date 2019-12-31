package net.dragoncat.product_info.datamodel

import java.math.BigDecimal

/**
 * Encapsulate a currency value by extending big decimal with set precision.
 */
data class Currency(private val cents: Long): BigDecimal(cents.toBigInteger(), 2) {
    /**
     * Display a currency with the currency symbol
     */
    override fun toString() = "$" + super.toString()

    /**
     * Returns the value of this number as a [Byte], which may involve rounding or truncation.
     * Required to extend [BigDecimal]
     */
    override fun toByte() = cents.toByte()

    /**
     * Returns the [Char] with the numeric value equal to this number, truncated to 16 bits if appropriate.
     * Required to extend [BigDecimal]
     */
    override fun toChar() = cents.toChar()

    /**
     * Returns the value of this number as a [Short], which may involve rounding or truncation.
     * Required to extend [BigDecimal]
     */
    override fun toShort() = cents.toShort()
}