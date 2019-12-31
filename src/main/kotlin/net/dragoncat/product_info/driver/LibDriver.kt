package net.dragoncat.product_info.driver

import java.io.File
import net.dragoncat.product_info.processors.ProductRecordProcessorStringFieldImpl

/**
 * Simple driver application to demonstrate the library and it's file-stream
 * implementation
 */
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
                try {
                    File(this).inputStream().apply {
                        ProductRecordProcessorStringFieldImpl().process(this).forEach { println(it) }
                    }.close()
                } catch (e: Exception) {
                    usage(e.message ?: e.toString())
                }
            } else null
        } ?: usage("Must provide an input file to operate on.")
    }
}

fun main(args: Array<String>) {
    val driver = LibDriver()
    driver.run(args)
}
