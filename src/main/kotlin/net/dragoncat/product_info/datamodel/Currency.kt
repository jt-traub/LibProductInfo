package net.dragoncat.product_info.datamodel

import java.math.BigDecimal
import java.math.RoundingMode

data class Currency(val centisimalValue: Long) {
    private val cost: BigDecimal = BigDecimal.valueOf(centisimalValue, 2)

    operator fun div(divisor: Long) =
        cost.setScale(4).divide(divisor.toBigDecimal(), RoundingMode.HALF_DOWN).toDouble()

    fun toLong() = centisimalValue
    fun toDouble() = cost.toDouble()
    override fun toString() = "$$cost"
}