[.](../../index.md) / [net.dragoncat.product_info.processors](../index.md) / [ProductRecordProcessorStringFieldImpl](index.md) / [process](./process.md)

# process

`fun process(input: `[`InputStream`](https://docs.oracle.com/javase/6/docs/api/java/io/InputStream.html)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`ProductRecord`](../../net.dragoncat.product_info.datamodel/-product-record/index.md)`>`

take an input stream, treating it as a stream of stings (lines) and process each line into
a [ProductRecord](../../net.dragoncat.product_info.datamodel/-product-record/index.md) returning the collection as a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)

