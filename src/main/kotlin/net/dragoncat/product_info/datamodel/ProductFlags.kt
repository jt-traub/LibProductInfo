package net.dragoncat.product_info.datamodel

/**
 * Store the internal representation of known product flags and allow creating, modifying and querying
 * those flags.
 */
data class ProductFlags(
    private val flags: Set<Flags> = setOf()
) {
    companion object {
        /**
         * Construct a new ProductFlags object from the input setting flags based on 'Y' or 'N' in the string, with
         * flag [Flags.UNKNOWN1] being the first character in the string
         */
        fun parse(inp: String) = ProductFlags(Flags.values().filter { inp.getOrElse(it.ordinal) { 'N' } == 'Y' }.toSet())

        /**
         * Construct a new ProductFlags from a bitfield encoded [Long]
         */
        fun fromLong(fl: Long) = ProductFlags(Flags.values().filter { fl and (1L shl it.ordinal) != 0L }.toSet())
    }

    /**
     * Check if the flag is set
     */
    fun isSet(f: Flags) = flags.contains(f)

    /**
     * Show the flags as a string of Y/N
     */
    override fun toString() = Flags.values().joinToString("") { if (isSet(it)) "Y" else "N" }

    // for database persistence, convert to/from a bitfield stored as a long (for use in a relational DB)
    /**
     * Convert the internal representation to a [Long] to allow storing the flags in a concise form in a database
     */
    fun toLong() = flags.map { 1L shl it.ordinal }.sum()

    /**
     * Return the flags as a [Set] of [Flags]
     */
    fun toSet() = flags
}
