[LibProductInfo](../../index.md) / [net.dragoncat.product_info.datamodel](../index.md) / [ProductRecordImpl](./index.md)

# ProductRecordImpl

`data class ProductRecordImpl : `[`ProductRecord`](../-product-record/index.md)

An internal implementation of the [ProductRecord](../-product-record/index.md) interface used by the string-field parser

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | An internal implementation of the [ProductRecord](../-product-record/index.md) interface used by the string-field parser`ProductRecordImpl(productId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, productDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, regularPrice: `[`PriceData`](../-price-data/index.md)`? = null, promoPrice: `[`PriceData`](../-price-data/index.md)`? = null, productFlags: `[`ProductFlags`](../-product-flags/index.md)`? = null, productSize: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [productDescription](product-description.md) | `var productDescription: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [productFlags](product-flags.md) | `var productFlags: `[`ProductFlags`](../-product-flags/index.md)`?` |
| [productId](product-id.md) | `var productId: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [productSize](product-size.md) | `var productSize: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [promoPrice](promo-price.md) | `var promoPrice: `[`PriceData`](../-price-data/index.md)`?` |
| [promotionalPriceCalculator](promotional-price-calculator.md) | `val promotionalPriceCalculator: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [promotionalPriceDisplay](promotional-price-display.md) | `val promotionalPriceDisplay: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [regularPrice](regular-price.md) | `var regularPrice: `[`PriceData`](../-price-data/index.md)`?` |
| [regularPriceCalculator](regular-price-calculator.md) | `val regularPriceCalculator: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [regularPriceDisplay](regular-price-display.md) | `val regularPriceDisplay: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [taxRate](tax-rate.md) | `val taxRate: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [unitOfMeasure](unit-of-measure.md) | `val unitOfMeasure: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Functions

| Name | Summary |
|---|---|
| [toString](to-string.md) | `fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
