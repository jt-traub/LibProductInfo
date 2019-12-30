package net.dragoncat.product_info.datamodel

data class ProductRecord(
    var productId: Long? = null,
    var productDescription: String? = null,
    var regularPrice: PriceData? = null,
    var promoPrice: PriceData? = null,
    var productFlags: ProductFlags? = null,
    var productSize: String? = null
) {
    val regularPriceDisplay get() = regularPrice?.display() ?: "$0.00"
    val regularPriceCalculator get() = regularPrice?.calculatorValue() ?: 0.0
    val promotionalPriceDisplay get() = promoPrice?.display()
    val promotionalPriceCalculator get() = promoPrice?.calculatorValue()
    val unitOfMeasure get() = if(productFlags?.isSet(Flags.PER_WEIGHT) == true) "Pound" else "Each"
    val taxRate get() = if (productFlags?.isSet(Flags.TAXABLE) == true) .07775 else null
}