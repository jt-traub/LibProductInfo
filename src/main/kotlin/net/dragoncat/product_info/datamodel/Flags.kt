package net.dragoncat.product_info.datamodel

/**
 * Enumeration of all existent flag positions.  Only flag 3 [PER_WEIGHT] and 5 [TAXABLE] have
 * defined meaning at this time.
 */
enum class Flags {
    UNKNOWN1,
    UNKNOWN2,
    /** Item is cost per pound rather than per item */
    PER_WEIGHT,
    UNKNOWN4,
    /** Item is taxable */
    TAXABLE,
    UNKNOWN6,
    UNKNOWN7,
    UNKNOWN8,
    UNKNOWN9;
}