package net.dragoncat.product_info.datamodel

data class PriceData(
    val cost: Currency,
    val split: Long = 0
) {
    override fun toString() = if (split == 0L) "$cost" else "$split for $cost"
    fun calculatorValue() = if (split == 0L) cost.toDouble() else cost.div(split)

    fun display() = toString()
}