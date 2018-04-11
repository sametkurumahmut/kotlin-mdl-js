package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinmdl.style.IMdlBackgroundColor
import kotlinmdl.style.IMdlTextColor
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.Element
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlContactChip(
        element: HTMLSpanElement,
        text: String,
        contactText: String,
        contactColor: IMdlTextColor? = null,
        contactBackgroundColor: IMdlBackgroundColor? = null,
        classes: String = String.empty) : MdlBasicContactChipBase<HTMLSpanElement>(element, classes) {

    constructor(
            text: String,
            contactText: String,
            contactColor: IMdlTextColor? = null,
            contactBackgroundColor: IMdlBackgroundColor? = null,
            classes: String = String.empty)
            : this(document.create.span(), text, contactText, contactColor, contactBackgroundColor, classes)

    override var contact: IMdlChipBasicContact<Element> by this.replaceOrAppendExistingChildOfThis(
            element,
            MdlChipBasicContact(contactText, contactColor, contactBackgroundColor))

    override var text: IMdlChipText<Element> by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))
}
