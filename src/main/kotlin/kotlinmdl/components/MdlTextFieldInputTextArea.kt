package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.TextAreaWrap
import kotlinx.html.dom.create
import kotlinx.html.js.textArea
import org.w3c.dom.HTMLTextAreaElement
import kotlin.browser.document

open class MdlTextFieldInputTextArea(element: HTMLTextAreaElement, id: String, classes: String = String.empty)
    : MdlTextFieldInputBase<HTMLTextAreaElement>(element, id, classes) {

    constructor(
            id: String,
            rows: Int? = null,
            cols: Int? = null,
            wrap: TextAreaWrap? = null,
            classes: String = String.empty)
            : this(document.create.textArea(rows?.toString(), cols?.toString(), wrap, block = {}), id, classes)
}
