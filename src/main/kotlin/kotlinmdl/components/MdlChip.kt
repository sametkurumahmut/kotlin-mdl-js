package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlChip(
        element: HTMLSpanElement,
        hasContact: Boolean = false,
        isDeletable: Boolean = false,
        classes: String = String.empty) : MdlChipBase<HTMLSpanElement>(element, hasContact, isDeletable, classes) {

    constructor(hasContact: Boolean = false, isDeletable: Boolean = false, classes: String = String.empty)
            : this(document.create.span(), hasContact, isDeletable, classes)
}
