[.](../../index.md) / [net.dragoncat.product_info](../index.md) / [ProductRecordProcessor](./index.md)

# ProductRecordProcessor

`interface ProductRecordProcessor`

Define the interface that all external callers of the library will see.

### Functions

| Name | Summary |
|---|---|
| [process](process.md) | Process an [InputStream](https://docs.oracle.com/javase/6/docs/api/java/io/InputStream.html) and return a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of [ProductRecord](../../net.dragoncat.product_info.datamodel/-product-record/index.md)`abstract fun process(input: `[`InputStream`](https://docs.oracle.com/javase/6/docs/api/java/io/InputStream.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ProductRecord`](../../net.dragoncat.product_info.datamodel/-product-record/index.md)`>` |

### Inheritors

| Name | Summary |
|---|---|
| [ProductRecordProcessorStringFieldImpl](../../net.dragoncat.product_info.processors/-product-record-processor-string-field-impl/index.md) | Implementation of a ProductRecordProcessor that parses the stream into lines and then parses each line based on positional fields.`class ProductRecordProcessorStringFieldImpl : `[`ProductRecordProcessor`](./index.md) |
