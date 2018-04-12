package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinx.html.ButtonFormEncType
import kotlinx.html.ButtonFormMethod
import kotlinx.html.ButtonType
import kotlinx.html.dom.create
import kotlinx.html.js.button
import org.w3c.dom.Element
import org.w3c.dom.HTMLButtonElement
import kotlin.browser.document

open class MdlBasicButtonChip(element: HTMLButtonElement, text: String, classes: String = String.empty)
    : MdlBasicChipBase<HTMLButtonElement>(element, classes = classes) {

    constructor(
            text: String,
            formEncType: ButtonFormEncType? = null,
            formMethod: ButtonFormMethod? = null,
            name: String? = null,
            type: ButtonType? = ButtonType.button,
            classes: String = String.empty)
            : this(document.create.button(formEncType, formMethod, name, type), text, classes)

    override var text: IMdlChipText<Element> by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))
}
