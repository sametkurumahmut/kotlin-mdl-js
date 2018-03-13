package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.footer
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlMegaFooter(element: HTMLElement, classes: String = String.empty)
    : MdlMegaFooterBase<HTMLElement>(element, classes) {

    constructor(classes: String = String.empty) : this(document.create.footer(), classes)
}
