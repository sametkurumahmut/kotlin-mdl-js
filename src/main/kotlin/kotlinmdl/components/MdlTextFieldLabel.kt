package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.label
import org.w3c.dom.HTMLLabelElement
import kotlin.browser.document

open class MdlTextFieldLabel(element: HTMLLabelElement, text: String, classes: String = String.empty)
    : MdlTextFieldLabelBase<HTMLLabelElement>(element, text, classes) {

    constructor(text: String, htmlFor: String, classes: String = String.empty)
            : this(document.create.label().also { it.htmlFor = htmlFor }, text, classes)
}
