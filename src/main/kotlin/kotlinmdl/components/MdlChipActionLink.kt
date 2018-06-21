package kotlinmdl.components

import kotlinmdl.components.style.IMdlMaterialIcon
import kotlinmdl.components.style.MdlMaterialIcons
import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.a
import org.w3c.dom.Element
import org.w3c.dom.HTMLAnchorElement
import kotlin.browser.document

open class MdlChipActionLink(
        element: HTMLAnchorElement,
        icon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
        classes: String = String.empty) : MdlChipActionBase<HTMLAnchorElement>(element, icon, classes) {

    constructor(
            href: String? = null,
            target: String? = null,
            icon: IMdlMaterialIcon<Element>? = MdlMaterialIcons.cancel(),
            classes: String = String.empty) : this(document.create.a(href, target), icon, classes)
}
