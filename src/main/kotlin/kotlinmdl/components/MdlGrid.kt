package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlGrid(element: HTMLDivElement, hasSpacing: Boolean = true, classes: String = String.empty)
    : MdlGridBase<HTMLDivElement>(element, hasSpacing, classes) {

    constructor(hasSpacing: Boolean = true, classes: String = String.empty)
            : this(document.create.div(), hasSpacing, classes)
}
