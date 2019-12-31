

### All Types

| Name | Summary |
|---|---|
|

##### [net.dragoncat.product_info.datamodel.Currency](../net.dragoncat.product_info.datamodel/-currency/index.md)

Encapsulate a currency value by extending big decimal with set precision.


|

##### [net.dragoncat.product_info.datamodel.Flags](../net.dragoncat.product_info.datamodel/-flags/index.md)

Enumeration of all existent flag positions.  Only flag 3 (PER_WEIGHT) and 5 (TAXABLE) have
defined meaning at this time.


|

##### [net.dragoncat.product_info.driver.LibDriver](../net.dragoncat.product_info.driver/-lib-driver/index.md)

Simple driver application to demonstrate the library and it's file-stream
implementation


|

##### [net.dragoncat.product_info.datamodel.PriceData](../net.dragoncat.product_info.datamodel/-price-data/index.md)

Interface exposing a view for pricing data


|

##### [net.dragoncat.product_info.datamodel.ProductFlags](../net.dragoncat.product_info.datamodel/-product-flags/index.md)

Store the internal representation of known product flags and allow creating, modifying and querying
those flags.


|

##### [net.dragoncat.product_info.datamodel.ProductRecord](../net.dragoncat.product_info.datamodel/-product-record/index.md)

Definition of fields required for a product record, per spec


|

##### [net.dragoncat.product_info.datamodel.ProductRecordImpl](../net.dragoncat.product_info.datamodel/-product-record-impl/index.md)

An internal implementation of the [ProductRecord](../net.dragoncat.product_info.datamodel/-product-record/index.md) interface used by the string-field parser


|

##### [net.dragoncat.product_info.ProductRecordProcessor](../net.dragoncat.product_info/-product-record-processor/index.md)

Define the interface that all external callers of the library will see.


|

##### [net.dragoncat.product_info.processors.ProductRecordProcessorStringFieldImpl](../net.dragoncat.product_info.processors/-product-record-processor-string-field-impl/index.md)

Implementation of a ProductRecordProcessor that parses the stream into
lines and then parses each line based on positional fields.


|

##### [net.dragoncat.product_info.datamodel.SinglePrice](../net.dragoncat.product_info.datamodel/-single-price/index.md)

Implementation of a single price for 1 item


|

##### [net.dragoncat.product_info.datamodel.SplitPrice](../net.dragoncat.product_info.datamodel/-split-price/index.md)

Pricing for a set of the same item (ie, 3 for $4.00)


