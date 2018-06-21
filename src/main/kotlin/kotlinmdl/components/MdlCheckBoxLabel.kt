package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlCheckBoxLabel(element: HTMLSpanElement, text: String, classes: String = String.empty)
    : MdlCheckBoxLabelBase<HTMLSpanElement>(element, text, classes) {

    constructor(text: String, classes: String = String.empty) : this(document.create.span(), text, classes)
}
