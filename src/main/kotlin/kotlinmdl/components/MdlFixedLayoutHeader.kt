package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.header
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlFixedLayoutHeader(
        element: HTMLElement,
        isSeamed: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty)
    : MdlFixedLayoutHeaderBase<HTMLElement>(element, isSeamed, isTransparent, classes) {

    constructor(isSeamed: Boolean = false, isTransparent: Boolean = false, classes: String = String.empty)
            : this(document.create.header(), isSeamed, isTransparent, classes)
}
