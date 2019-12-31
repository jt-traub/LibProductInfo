package net.dragoncat.product_info.datamodel

import java.math.BigDecimal

/**
 * Implement a US $ monetary type that sits on top of BigDecimal and implements the currency interface
 */
data class USMoney(private val cents: Long) : BigDecimal(cents.toBigInteger(), 2), Currency {
    /**
     * Display the currency value with the USD currency symbol
     */
    override fun toString() = '$' + super.toString()

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

    override fun toBigDecimal() = this
}
