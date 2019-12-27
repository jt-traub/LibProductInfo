package net.dragoncat.product_info.driver

private fun promptInput(s: String): String? {
    print(s)
    return readLine()
}

private fun usage(e: String) {
    println(e)
    println()
    println("Usage: java -jar LibProductInfo-<version>.jar <filename>")
}

// Solely exists to act as a driver for the rest of the library
fun main(args: Array<String>) {
    val inputFile = if (args.isNotEmpty()) args[0] else promptInput(
        "Input file? - "
    )

    inputFile?.run {
        if (this.isNotEmpty()) {
            // do the processing
        } else null
    } ?: usage("Must provide an input file to operate on.")
}