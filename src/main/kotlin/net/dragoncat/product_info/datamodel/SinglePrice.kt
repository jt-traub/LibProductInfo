package net.dragoncat.product_info.datamodel

/**
 * Implementation of a single price for 1 item
 */
data class SinglePrice(
    /** Underlying cost as a [Currency] value */
    override val cost: Currency
): PriceData {
    /** Overload string display to underlying value */
    override fun toString() = cost.toString()
    /** calculator value is just the underlying price */
    override fun calculatorValue() = cost.toDouble()
    /** display is just the underlying value as a string */
    override fun display() = toString()
}