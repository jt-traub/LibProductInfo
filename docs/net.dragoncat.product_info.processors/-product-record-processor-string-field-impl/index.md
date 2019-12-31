[.](../../index.md) / [net.dragoncat.product_info.processors](../index.md) / [ProductRecordProcessorStringFieldImpl](./index.md)

# ProductRecordProcessorStringFieldImpl

`class ProductRecordProcessorStringFieldImpl : `[`ProductRecordProcessor`](../../net.dragoncat.product_info/-product-record-processor/index.md)

Implementation of a ProductRecordProcessor that parses the stream into
lines and then parses each line based on positional fields.

### Types

| Name | Summary |
|---|---|
| [Fields](-fields/index.md) | Internal enum defining each fields position within the string format Spec specified fields with a 1-base, but internally we represent them as 0-based`enum class Fields` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Implementation of a ProductRecordProcessor that parses the stream into lines and then parses each line based on positional fields.`ProductRecordProcessorStringFieldImpl()` |

### Functions

| Name | Summary |
|---|---|
| [process](process.md) | take an input stream, treating it as a stream of stings (lines) and process each line into a [ProductRecord](../../net.dragoncat.product_info.datamodel/-product-record/index.md) returning the collection as a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`fun process(input: `[`InputStream`](https://docs.oracle.com/javase/6/docs/api/java/io/InputStream.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ProductRecord`](../../net.dragoncat.product_info.datamodel/-product-record/index.md)`>` |
