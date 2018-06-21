package kotlinmdl.extensions

import kotlinmdl.internal.extensions.empty

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
