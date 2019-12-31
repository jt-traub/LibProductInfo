[.](../../index.md) / [net.dragoncat.product_info.datamodel](../index.md) / [USMoney](./index.md)

# USMoney

`data class USMoney : `[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`, `[`Currency`](../-currency/index.md)

Implement a US $ monetary type that sits on top of BigDecimal and implements the currency interface

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Implement a US $ monetary type that sits on top of BigDecimal and implements the currency interface`USMoney(cents: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)` |

### Functions

| Name | Summary |
|---|---|
| [toBigDecimal](to-big-decimal.md) | `fun toBigDecimal(): `[`USMoney`](./index.md) |
| [toByte](to-byte.md) | Returns the value of this number as a [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html), which may involve rounding or truncation. Required to extend [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`fun toByte(): `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [toChar](to-char.md) | Returns the [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) with the numeric value equal to this number, truncated to 16 bits if appropriate. Required to extend [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`fun toChar(): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [toShort](to-short.md) | Returns the value of this number as a [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html), which may involve rounding or truncation. Required to extend [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`fun toShort(): `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [toString](to-string.md) | Display the currency value with the USD currency symbol`fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
