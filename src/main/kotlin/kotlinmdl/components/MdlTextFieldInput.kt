package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.InputFormEncType
import kotlinx.html.InputFormMethod
import kotlinx.html.InputType
import kotlinx.html.dom.create
import kotlinx.html.js.input
import org.w3c.dom.HTMLInputElement
import kotlin.browser.document

open class MdlTextFieldInput(element: HTMLInputElement, id: String, classes: String = String.empty)
    : MdlTextFieldInputBase<HTMLInputElement>(element, id, classes) {

    constructor(
            id: String,
            pattern: String? = null,
            type: InputType? = InputType.text,
            formEncType: InputFormEncType? = null,
            formMethod: InputFormMethod? = null,
            name: String? = null,
            classes: String = String.empty) :
            this(
                    document.create.input(type, formEncType, formMethod, name).apply {
                        pattern?.also { this.pattern = pattern }
                    },
                    id,
                    classes)
}
