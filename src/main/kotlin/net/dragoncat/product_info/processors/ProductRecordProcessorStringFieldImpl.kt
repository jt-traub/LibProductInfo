package net.dragoncat.product_info.processors

import net.dragoncat.product_info.ProductRecordProcessor
import net.dragoncat.product_info.datamodel.*
import java.io.InputStream

/**
 * Implementation of a ProductRecordProcessor that parses the stream into
 * lines and then parses each line based on positional fields.
 */
class ProductRecordProcessorStringFieldImpl : ProductRecordProcessor {

    /**
     * Internal enum defining each fields position within the string format
     * Spec specified fields with a 1-base, but internally we represent them as 0-based
     */
    enum class Fields(val begin: Int, val end: Int) {
        // spec specified fields in 1-based.  Converted to 0 based here
        // End position is inclusive
        ProductId(0, 7),
        ProductDescription(9, 67),
        RegularSingularPrice(69, 76),
        PromotionalSingularPrice(78, 85),
        RegularSplitPrice(87, 94),
        PromotionalSplitPrice(96, 103),
        RegularForX(105, 112),
        PromotionalForX(114, 121),
        Flags(123, 131),
        ProductSize(133, 141)
    }

    /**
     * internal function for parsing a [String] out of a field-string.
     * internally visible for testing, otherwise it would be private
     */
    internal fun parseString(s: String, f: Fields) = s.substring(f.begin, f.end + 1).trim().ifEmpty { null }

    /**
     * internal function for parsing a [Long] out of a field-string.
     * internally visible for testing, otherwise it would be private
     */
    internal fun parseLong(s: String, f: Fields) = parseString(s, f)?.toLong()

    /**
     * internal function for parsing a [Currency] (implemented as [USMoney]) out of a field-string.
     * internally visible for testing, otherwise it would be private
     */
    internal fun parseCurrency(s: String, f: Fields): Currency? =
        parseLong(s, f)?.let { if (it == 0L) null else USMoney(it) }

    /**
     * internal function for parsing a [PriceData] out of a set of field-strings.
     * internally visible for testing, otherwise it would be private
     */
    internal fun parsePriceData(s: String, forX: Fields, single: Fields, split: Fields): PriceData? =
        parseLong(s, forX).let {
            if (it == 0L || it == null)
                parseCurrency(s, single).let { c -> if (c != null) SinglePrice(c) else null }
            else
                parseCurrency(s, split).let { c -> if (c != null) SplitPrice(c, it) else null }
        }

    /**
     * internal function for parsing a set of [ProductFlags] out of a field-string.
     * internally visible for testing, otherwise it would be private
     */
    internal fun parseFlags(s: String, f: Fields) = parseString(s, f)?.let { ProductFlags.parse(it) }

    /**
     * take an input stream, treating it as a stream of stings (lines) and process each line into
     * a [ProductRecord] returning the collection as a [List]
     */
    override fun process(input: InputStream): List<ProductRecord> {
        return input.bufferedReader().useLines {
            it.map { s ->
                // Build a internal implementation of the product record for that line of data
                ProductRecordImpl(
                    productId = parseLong(s, Fields.ProductId),
                    productDescription = parseString(s, Fields.ProductDescription),
                    regularPrice = parsePriceData(s, Fields.RegularForX,
                        Fields.RegularSingularPrice, Fields.RegularSplitPrice),
                    promoPrice = parsePriceData(s, Fields.PromotionalForX,
                        Fields.PromotionalSingularPrice, Fields.PromotionalSplitPrice),
                    productFlags = parseFlags(s, Fields.Flags),
                    productSize = parseString(s, Fields.ProductSize)
                )
            }.toList()
        }
    }
}
