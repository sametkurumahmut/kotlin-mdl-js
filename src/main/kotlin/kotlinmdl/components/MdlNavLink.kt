package kotlinmdl.components

import kotlinmdl.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.a
import org.w3c.dom.HTMLAnchorElement
import kotlin.browser.document

open class MdlNavLink(href: String? = null, target: String? = null, classes: String = String.empty)
    : MdlComponent<HTMLAnchorElement>(document.create.a(href, target, ELEMENT_NAME), classes) {

    companion object {

        const val ELEMENT_NAME = "mdl-navigation__link"
    }
}
