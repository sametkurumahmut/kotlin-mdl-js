package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.a
import org.w3c.dom.HTMLAnchorElement
import kotlin.browser.document

open class MdlNavLink(element: HTMLAnchorElement, classes: String = String.empty)
    : MdlComponent<HTMLAnchorElement>(element.apply { classList.add(IMdlNavLink.ELEMENT_NAME) }, classes),
        IMdlNavLink<HTMLAnchorElement> {

    constructor(href: String? = null, target: String? = null, classes: String = String.empty)
            : this(document.create.a(href, target), classes)
}
