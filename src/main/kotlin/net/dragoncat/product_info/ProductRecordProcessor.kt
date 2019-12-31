package net.dragoncat.product_info

import net.dragoncat.product_info.datamodel.ProductRecord
import java.io.InputStream

/**
 * Define the interface that all external callers of the library will see.
 */
interface ProductRecordProcessor {
    /**
     * Process an [InputStream] and return a [List] of [ProductRecord]
     */
    fun process(input: InputStream): List<ProductRecord>
}
