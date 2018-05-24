package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlTextField(
        element: HTMLDivElement,
        hasFloatingLabel: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty)
    : MdlTextFieldBase<HTMLDivElement>(element, hasFloatingLabel, isExpandable, classes) {

    constructor(hasFloatingLabel: Boolean = false, isExpandable: Boolean = false, classes: String = String.empty)
            : this(document.create.div(), hasFloatingLabel, isExpandable, classes)
}
