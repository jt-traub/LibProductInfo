[LibProductInfo](../../index.md) / [net.dragoncat.product_info.datamodel](../index.md) / [Currency](./index.md)

# Currency

`data class Currency : `[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)

Encapsulate a currency value by extending big decimal with set precision.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Encapsulate a currency value by extending big decimal with set precision.`Currency(cents: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`)` |

### Functions

| Name | Summary |
|---|---|
| [toByte](to-byte.md) | Returns the value of this number as a [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html), which may involve rounding or truncation. Required to extend [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`fun toByte(): `[`Byte`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [toChar](to-char.md) | Returns the [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) with the numeric value equal to this number, truncated to 16 bits if appropriate. Required to extend [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`fun toChar(): `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [toShort](to-short.md) | Returns the value of this number as a [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html), which may involve rounding or truncation. Required to extend [BigDecimal](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`fun toShort(): `[`Short`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [toString](to-string.md) | Display a currency with the currency symbol`fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
