package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.ul
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlMiniFooterLinkList(element: HTMLElement, classes: String = String.empty)
    : MdlMiniFooterLinkListBase<HTMLElement>(element, classes) {

    constructor(classes: String = String.empty) : this(document.create.ul(), classes)
}
