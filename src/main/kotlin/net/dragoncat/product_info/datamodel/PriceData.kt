package net.dragoncat.product_info.datamodel

/**
 * Interface exposing a view for pricing data
 */
interface PriceData {
    /** Base currency value */
    val cost: Currency
    /** Display the price as a [Double] for use in any calculation */
    fun calculatorValue(): Double
    /** display the price as a [String] */
    fun display(): String
}
