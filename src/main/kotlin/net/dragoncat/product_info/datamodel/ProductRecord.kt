package net.dragoncat.product_info.datamodel

/**
 * Definition of fields required for a product record, per spec
 */
interface ProductRecord {
    val productId: Long?
    val productDescription: String?
    val regularPriceDisplay: String?
    val regularPriceCalculator: Double?
    val promotionalPriceDisplay: String?
    val promotionalPriceCalculator: Double?
    val unitOfMeasure: String?
    val taxRate: Double?
    val productSize: String?
}