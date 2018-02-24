package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.header
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlScrollableLayoutHeader(
        element: HTMLElement,
        isTransparent: Boolean = false,
        classes: String = String.empty)
    : MdlScrollableLayoutHeaderBase<HTMLElement>(element, isTransparent, classes) {

    constructor(isTransparent: Boolean = false, classes: String = String.empty)
            : this(document.create.header(), isTransparent, classes)
}
