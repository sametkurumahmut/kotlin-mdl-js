package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.style.IMdlBackgroundColor
import kotlinmdl.style.IMdlTextColor
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlChipBasicContact(
        element: HTMLSpanElement,
        text: String,
        color: IMdlTextColor? = null,
        backgroundColor: IMdlBackgroundColor? = null,
        classes: String = String.empty)
    : MdlChipBasicContactBase<HTMLSpanElement>(element, text, color, backgroundColor, classes) {

    constructor(
            text: String,
            color: IMdlTextColor? = null,
            backgroundColor: IMdlBackgroundColor? = null,
            classes: String = String.empty) : this(document.create.span(), text, color, backgroundColor, classes)
}
