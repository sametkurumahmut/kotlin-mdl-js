package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlMegaFooterBottomSection(element: HTMLDivElement, classes: String = String.empty)
    : MdlMegaFooterBottomSectionBase<HTMLDivElement>(element, classes) {

    constructor(classes: String = String.empty) : this(document.create.div(), classes)
}
