[.](../../index.md) / [net.dragoncat.product_info.datamodel](../index.md) / [ProductFlags](./index.md)

# ProductFlags

`data class ProductFlags`

Store the internal representation of known product flags and allow creating, modifying and querying
those flags.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Store the internal representation of known product flags and allow creating, modifying and querying those flags.`ProductFlags(flags: `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Flags`](../-flags/index.md)`> = setOf())` |

### Functions

| Name | Summary |
|---|---|
| [isSet](is-set.md) | Check if the flag is set`fun isSet(f: `[`Flags`](../-flags/index.md)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [toLong](to-long.md) | Convert the internal representation to a [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) to allow storing the flags in a concise form in a database`fun toLong(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [toSet](to-set.md) | Return the flags as a [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html) of [Flags](../-flags/index.md)`fun toSet(): `[`Set`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)`<`[`Flags`](../-flags/index.md)`>` |
| [toString](to-string.md) | Show the flags as a string of Y/N`fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [fromLong](from-long.md) | Construct a new ProductFlags from a bitfield encoded [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`fun fromLong(fl: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`ProductFlags`](./index.md) |
| [parse](parse.md) | Construct a new ProductFlags object from the input setting flags based on 'Y' or 'N' in the string, with flag [Flags.UNKNOWN1](../-flags/-u-n-k-n-o-w-n1.md) being the first character in the string`fun parse(inp: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`ProductFlags`](./index.md) |
