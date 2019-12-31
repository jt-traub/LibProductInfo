[LibProductInfo](../../index.md) / [net.dragoncat.product_info.datamodel](../index.md) / [SplitPrice](./index.md)

# SplitPrice

`data class SplitPrice : `[`PriceData`](../-price-data/index.md)

Pricing for a set of the same item (ie, 3 for $4.00)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Pricing for a set of the same item (ie, 3 for $4.00)`SplitPrice(cost: `[`Currency`](../-currency/index.md)`, forX: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [cost](cost.md) | Underlying cost as a [Currency](../-currency/index.md) value`val cost: `[`Currency`](../-currency/index.md) |
| [forX](for-x.md) | Number of items in group`val forX: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

### Functions

| Name | Summary |
|---|---|
| [calculatorValue](calculator-value.md) | Double value is computed via [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html) and with 4 decimals and rounded half-down as per spec`fun calculatorValue(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [display](display.md) | String for display is same as printable string`fun display(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [toString](to-string.md) | Override for printable string`fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
