package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlCardSupportingText(
        element: HTMLDivElement,
        text: String,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty)
    : MdlCardSupportingTextBase<HTMLDivElement>(element, text, hasBorder, isExpandable, classes) {

    constructor(text: String, hasBorder: Boolean = false, isExpandable: Boolean = false, classes: String = String.empty)
            : this(document.create.div(), text, hasBorder, isExpandable, classes)
}
