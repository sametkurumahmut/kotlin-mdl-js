package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlChipContact(element: HTMLSpanElement, classes: String = String.empty)
    : MdlChipContactBase<HTMLSpanElement>(element, classes) {

    constructor(classes: String = String.empty) : this(document.create.span(), classes)
}
