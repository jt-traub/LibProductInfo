[.](../../index.md) / [net.dragoncat.product_info.datamodel](../index.md) / [Currency](./index.md)

# Currency

`interface Currency`

Encapsulate a currency value type

### Functions

| Name | Summary |
|---|---|
| [toBigDecimal](to-big-decimal.md) | `abstract fun toBigDecimal(): `[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html) |
| [toDouble](to-double.md) | `abstract fun toDouble(): `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [USMoney](../-u-s-money/index.md) | Implement a US $ monetary type that sits on top of BigDecimal and implements the currency interface`data class USMoney : `[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`, `[`Currency`](./index.md) |
