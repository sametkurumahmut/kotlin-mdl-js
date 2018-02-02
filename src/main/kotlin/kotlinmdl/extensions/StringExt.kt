package kotlinmdl.extensions

/**
 * The empty holds empty string value.
 */
val String.Companion.empty: String
    get() = ""

infix fun String?.attributeSeparator(append: String?): String {
    val thisFlag = !this.isNullOrBlank()

    return if (thisFlag && !append.isNullOrBlank())
        "$this $append"
    else if (thisFlag)
        this!!
    else if (!append.isNullOrBlank())
        append!!
    else
        String.empty
}
