[LibProductInfo](../../index.md) / [net.dragoncat.product_info.datamodel](../index.md) / [ProductRecord](./index.md)

# ProductRecord

`interface ProductRecord`

Definition of fields required for a product record, per spec

### Properties

| Name | Summary |
|---|---|
| [productDescription](product-description.md) | `abstract val productDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [productId](product-id.md) | `abstract val productId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [productSize](product-size.md) | `abstract val productSize: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [promotionalPriceCalculator](promotional-price-calculator.md) | `abstract val promotionalPriceCalculator: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [promotionalPriceDisplay](promotional-price-display.md) | `abstract val promotionalPriceDisplay: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [regularPriceCalculator](regular-price-calculator.md) | `abstract val regularPriceCalculator: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [regularPriceDisplay](regular-price-display.md) | `abstract val regularPriceDisplay: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [taxRate](tax-rate.md) | `abstract val taxRate: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [unitOfMeasure](unit-of-measure.md) | `abstract val unitOfMeasure: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Inheritors

| Name | Summary |
|---|---|
| [ProductRecordImpl](../-product-record-impl/index.md) | An internal implementation of the [ProductRecord](./index.md) interface used by the string-field parser`data class ProductRecordImpl : `[`ProductRecord`](./index.md) |
