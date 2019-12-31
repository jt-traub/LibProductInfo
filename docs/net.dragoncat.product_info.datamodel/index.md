[.](../index.md) / [net.dragoncat.product_info.datamodel](./index.md)

## Package net.dragoncat.product_info.datamodel

### Types

| Name | Summary |
|---|---|
| [Currency](-currency/index.md) | Encapsulate a currency value type`interface Currency` |
| [Flags](-flags/index.md) | Enumeration of all existent flag positions.  Only flag 3 [PER_WEIGHT](-flags/-p-e-r_-w-e-i-g-h-t.md) and 5 [TAXABLE](-flags/-t-a-x-a-b-l-e.md) have defined meaning at this time.`enum class Flags` |
| [PriceData](-price-data/index.md) | Interface exposing a view for pricing data`interface PriceData` |
| [ProductFlags](-product-flags/index.md) | Store the internal representation of known product flags and allow creating, modifying and querying those flags.`data class ProductFlags` |
| [ProductRecord](-product-record/index.md) | Definition of fields required for a product record, per spec`interface ProductRecord` |
| [ProductRecordImpl](-product-record-impl/index.md) | An internal implementation of the [ProductRecord](-product-record/index.md) interface used by the string-field parser`data class ProductRecordImpl : `[`ProductRecord`](-product-record/index.md) |
| [SinglePrice](-single-price/index.md) | Implementation of a single price for 1 item`data class SinglePrice : `[`PriceData`](-price-data/index.md) |
| [SplitPrice](-split-price/index.md) | Pricing for a set of the same item (ie, 3 for $4.00)`data class SplitPrice : `[`PriceData`](-price-data/index.md) |
| [USMoney](-u-s-money/index.md) | Implement a US $ monetary type that sits on top of BigDecimal and implements the currency interface`data class USMoney : `[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`, `[`Currency`](-currency/index.md) |
