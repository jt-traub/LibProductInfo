[LibProductInfo](../../index.md) / [net.dragoncat.product_info.datamodel](../index.md) / [SinglePrice](./index.md)

# SinglePrice

`data class SinglePrice : `[`PriceData`](../-price-data/index.md)

Implementation of a single price for 1 item

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Implementation of a single price for 1 item`SinglePrice(cost: `[`Currency`](../-currency/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [cost](cost.md) | Underlying cost as a [Currency](../-currency/index.md) value`val cost: `[`Currency`](../-currency/index.md) |

### Functions

| Name | Summary |
|---|---|
| [calculatorValue](calculator-value.md) | calculator value is just the underlying price`fun calculatorValue(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [display](display.md) | display is just the underlying value as a string`fun display(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [toString](to-string.md) | Overload string display to underlying value`fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
