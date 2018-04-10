package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.Element
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlContactImageChip(
        element: HTMLSpanElement,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        classes: String = String.empty) : MdlContactChipBase<HTMLSpanElement>(element, classes) {

    constructor(
            text: String,
            contactAlt: String? = null,
            contactSrc: String? = null,
            classes: String = String.empty) : this(document.create.span(), text, contactAlt, contactSrc, classes)

    override var contact: IMdlChipContact<Element>
            by this.replaceOrAppendExistingChildOfThis(element, MdlChipContactImage(contactAlt, contactSrc))

    override var text: IMdlChipText<Element> by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))
}
