package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.header
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlWaterfallLayoutHeader(
        element: HTMLElement,
        isTopHideable: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty)
    : MdlWaterfallLayoutHeaderBase<HTMLElement>(element, isTopHideable, isTransparent, classes) {

    constructor(isTopHideable: Boolean = false, isTransparent: Boolean = false, classes: String = String.empty)
            : this(document.create.header(), isTopHideable, isTransparent, classes)
}
