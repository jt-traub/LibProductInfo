package net.dragoncat.product_info

import net.dragoncat.product_info.datamodel.Currency
import net.dragoncat.product_info.datamodel.PriceData
import net.dragoncat.product_info.datamodel.ProductFlags
import net.dragoncat.product_info.datamodel.ProductRecord
import java.util.stream.Stream
import kotlin.streams.toList

class ProductRecordProcessor {
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

    internal fun parseString(s: String, f: Fields) = s.substring(f.begin, f.end+1).trim()

    internal fun parseLong(s: String, f: Fields) = parseString(s, f).toLong()

    internal fun parseCurrency(s: String, f: Fields) = parseLong(s, f).let {
        when (it) {
            0L -> null
            else -> Currency(it)
        }
    }

    internal fun parsePriceData(s: String, forX: Fields, single: Fields, split: Fields) =
        parseLong(s, forX).let {
            when(it) {
                0L -> parseCurrency(s, single).let { c -> if (c != null) PriceData(c) else null }
                else -> parseCurrency(s, split).let { c -> if (c != null) PriceData(c, it) else null }
            }
        }

    internal fun parseFlags(s: String, f: Fields) = ProductFlags.parse(parseString(s, f))

    fun getProductRecords(input: Stream<String>): List<ProductRecord> {
        return input.map { s ->
            // Build a product record for that line of data
            ProductRecord(
                productId = parseLong(s, Fields.ProductId),
                productDescription = parseString(s, Fields.ProductDescription),
                regularPrice = parsePriceData(s, Fields.RegularForX, Fields.RegularSingularPrice, Fields.RegularSplitPrice),
                promoPrice = parsePriceData(s, Fields.PromotionalForX, Fields.PromotionalSingularPrice, Fields.PromotionalSplitPrice),
                productFlags = parseFlags(s, Fields.Flags),
                productSize = parseString(s, Fields.ProductSize)
            )
        }.toList()
    }
}
