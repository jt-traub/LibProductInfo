package net.dragoncat.product_info.driver

// Solely exists to act as a driver for the rest of the library
class LibDriver {
    private fun promptInput(s: String): String? {
        print(s)
        return readLine()
    }

    private fun usage(e: String) {
        println(e)
        println()
        println("Usage: java -jar LibProductInfo-<version>.jar <filename>")
    }

    fun run(args: Array<String>) {
        val inputFile = if (args.isNotEmpty()) args[0] else promptInput("Input file? - ")

        inputFile?.run {
            if (this.isNotEmpty()) {
                // Do the processing
            } else null
        } ?: usage("Must provide an input file to operate on.")
    }
}

fun main(args: Array<String>) {
    val driver = LibDriver()
    driver.run(args)
}