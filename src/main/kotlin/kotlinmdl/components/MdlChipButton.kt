package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.ButtonFormEncType
import kotlinx.html.ButtonFormMethod
import kotlinx.html.ButtonType
import kotlinx.html.dom.create
import kotlinx.html.js.button
import org.w3c.dom.HTMLButtonElement
import kotlin.browser.document

open class MdlChipButton(element: HTMLButtonElement, classes: String = String.empty)
    : MdlChipBase<HTMLButtonElement>(element, classes = classes) {

    constructor(
            formEncType: ButtonFormEncType? = null,
            formMethod: ButtonFormMethod? = null,
            name: String? = null,
            type: ButtonType? = ButtonType.button,
            classes: String = String.empty) : this(document.create.button(formEncType, formMethod, name, type), classes)
}
