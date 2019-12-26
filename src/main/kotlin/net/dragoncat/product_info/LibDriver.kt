package net.dragoncat.product_info

private fun promptInput(s: String): String? {
    print(s)
    return readLine()
}

private fun usage(e: String) {
    println(e)
    println()
    println("Usage: jar LibProductInfo.jar <filename>")
}

// Solely exists to act as a driver for the rest of the library
fun main(args: Array<String>) {
    val inputFile = if (args.isNotEmpty()) args[0] else promptInput("Input file? - ")

    inputFile?.run {
        // do the processing
    } ?: usage("Must provide an input file to operate on.")
}