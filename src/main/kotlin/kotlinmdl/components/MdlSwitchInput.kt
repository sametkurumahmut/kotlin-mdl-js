package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.InputFormEncType
import kotlinx.html.InputFormMethod
import kotlinx.html.InputType
import kotlinx.html.dom.create
import kotlinx.html.js.input
import org.w3c.dom.HTMLInputElement
import kotlin.browser.document

open class MdlSwitchInput(element: HTMLInputElement, id: String, classes: String = String.empty)
    : MdlSwitchInputBase<HTMLInputElement>(element, id, classes) {

    constructor(
            id: String,
            isChecked: Boolean = false,
            type: InputType? = InputType.checkBox,
            formEncType: InputFormEncType? = null,
            formMethod: InputFormMethod? = null,
            name: String? = null,
            classes: String = String.empty) :
            this(document.create.input(type, formEncType, formMethod, name).apply { checked = isChecked }, id, classes)
}
