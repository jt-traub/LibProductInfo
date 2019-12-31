package net.dragoncat.product_info.datamodel

import java.math.BigDecimal

/**
 * Encapsulate a currency value type
 */
interface Currency {
    fun toBigDecimal(): BigDecimal
    fun toDouble(): Double
}
