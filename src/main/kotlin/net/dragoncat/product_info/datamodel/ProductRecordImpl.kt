package net.dragoncat.product_info.datamodel

/**
 * An internal implementation of the [ProductRecord] interface used by the string-field parser
 */
data class ProductRecordImpl(
    override var productId: Long? = null,
    override var productDescription: String? = null,
    var regularPrice: PriceData? = null,
    var promoPrice: PriceData? = null,
    var productFlags: ProductFlags? = null,
    override var productSize: String? = null
): ProductRecord {
    override val regularPriceDisplay get() = regularPrice?.display() ?: "$0.00"
    override val regularPriceCalculator get() = regularPrice?.calculatorValue() ?: 0.0
    override val promotionalPriceDisplay get() = promoPrice?.display()
    override val promotionalPriceCalculator get() = promoPrice?.calculatorValue()
    override val unitOfMeasure get() = if(productFlags?.isSet(Flags.PER_WEIGHT) == true) "Pound" else "Each"
    override val taxRate get() = if (productFlags?.isSet(Flags.TAXABLE) == true) .07775 else null

    override fun toString() =
        "$productId: $productDescription " +
                "[Reg: $regularPriceDisplay ($regularPriceCalculator); " +
                "Promo: $promotionalPriceDisplay ($promotionalPriceCalculator)] " +
                "$unitOfMeasure (Tax: $taxRate) Size: $productSize"
}