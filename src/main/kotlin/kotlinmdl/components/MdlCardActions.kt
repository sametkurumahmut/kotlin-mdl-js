package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlCardActions(
        element: HTMLDivElement,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty)
    : MdlCardActionsBase<HTMLDivElement>(element, hasBorder, isExpandable, classes) {

    constructor(hasBorder: Boolean = false, isExpandable: Boolean = false, classes: String = String.empty)
            : this(document.create.div(), hasBorder, isExpandable, classes)
}
