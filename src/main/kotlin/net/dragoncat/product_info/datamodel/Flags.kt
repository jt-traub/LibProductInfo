package net.dragoncat.product_info.datamodel

/**
 * Enumeration of all existant flag positions.  Only flag 3 (PER_WEIGHT) and 5 (TAXABLE) have
 * defined meaning at this itme.
 */
enum class Flags {
    // While we only care (today) about flags 3 (WEIGHT) and 5 (TAX) I want to preserve all
    // values from the input into the set just in case we care about more in the future
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