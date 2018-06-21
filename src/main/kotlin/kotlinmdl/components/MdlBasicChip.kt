package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.Element
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlBasicChip(element: HTMLSpanElement, text: String, classes: String = String.empty)
    : MdlBasicChipBase<HTMLSpanElement>(element, classes = classes) {

    constructor(text: String, classes: String = String.empty) : this(document.create.span(), text, classes)

    override var text: IMdlChipText<Element> by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))
}
