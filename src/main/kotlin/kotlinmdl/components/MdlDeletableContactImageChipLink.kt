package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.components.style.MdlMaterialIcons
import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.Element
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlDeletableContactImageChipLink(
        element: HTMLSpanElement,
        text: String,
        contactAlt: String? = null,
        contactSrc: String? = null,
        actionHref: String? = null,
        actionTarget: String? = null,
        actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty) : MdlDeletableContactChipBase<HTMLSpanElement>(element, classes) {

    constructor(
            text: String,
            contactAlt: String? = null,
            contactSrc: String? = null,
            actionHref: String? = null,
            actionTarget: String? = null,
            actionIcon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
            classes: String = String.empty) :
            this(
                    document.create.span(),
                    text,
                    contactAlt,
                    contactSrc,
                    actionHref,
                    actionTarget,
                    actionIcon,
                    classes)

    override var contact: IMdlChipContact<Element>
            by this.replaceOrAppendExistingChildOfThis(element, MdlChipContactImage(contactAlt, contactSrc))

    override var text: IMdlChipText<Element> by this.replaceOrAppendExistingChildOfThis(element, MdlChipText(text))

    override var action: IMdlChipAction<Element>
            by this.replaceOrAppendExistingChildOfThis(element, MdlChipActionLink(actionHref, actionTarget, actionIcon))
}
