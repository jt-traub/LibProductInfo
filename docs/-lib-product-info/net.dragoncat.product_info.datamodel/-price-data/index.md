[LibProductInfo](../../index.md) / [net.dragoncat.product_info.datamodel](../index.md) / [PriceData](./index.md)

# PriceData

`interface PriceData`

Interface exposing a view for pricing data

### Properties

| Name | Summary |
|---|---|
| [cost](cost.md) | Base currency value`abstract val cost: `[`Currency`](../-currency/index.md) |

### Functions

| Name | Summary |
|---|---|
| [calculatorValue](calculator-value.md) | Display the price as a [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) for use in any calculation`abstract fun calculatorValue(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [display](display.md) | display the price as a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`abstract fun display(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [SinglePrice](../-single-price/index.md) | Implementation of a single price for 1 item`data class SinglePrice : `[`PriceData`](./index.md) |
| [SplitPrice](../-split-price/index.md) | Pricing for a set of the same item (ie, 3 for $4.00)`data class SplitPrice : `[`PriceData`](./index.md) |
