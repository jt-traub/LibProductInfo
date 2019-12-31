package net.dragoncat.product_info.datamodel

import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Pricing for a set of the same item (ie, 3 for $4.00)
 */
data class SplitPrice(
    /** Underlying cost as a [Currency] value */
    override val cost: Currency,
    /** Number of items in group */
    val forX: Long
) : PriceData {
    /** Override for printable string */
    override fun toString() = "$forX for $cost"
    /** Double value is computed via [BigDecimal] and with 4 decimals and rounded half-down as per spec */
    override fun calculatorValue() = cost.toBigDecimal().divide(forX.toBigDecimal(), 4, RoundingMode.HALF_DOWN).toDouble()
    /** String for display is same as printable string */
    override fun display() = toString()
}
