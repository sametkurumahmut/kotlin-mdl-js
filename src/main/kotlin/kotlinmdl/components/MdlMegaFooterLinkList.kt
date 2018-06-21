package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.ul
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlMegaFooterLinkList(element: HTMLElement, classes: String = String.empty)
    : MdlMegaFooterLinkListBase<HTMLElement>(element, classes) {

    constructor(classes: String = String.empty) : this(document.create.ul(), classes)
}
