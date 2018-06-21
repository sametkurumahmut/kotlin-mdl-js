package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.footer
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlMiniFooter(element: HTMLElement, classes: String = String.empty)
    : MdlMiniFooterBase<HTMLElement>(element, classes) {

    constructor(classes: String = String.empty) : this(document.create.footer(), classes)
}
