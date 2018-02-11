package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClass
import kotlinx.html.dom.create
import kotlinx.html.js.header
import org.w3c.dom.HTMLElement
import kotlin.browser.document

abstract class MdlLayoutHeader(isTransparent: Boolean = false, classes: String = String.empty)
    : MdlLayoutElement<HTMLElement>(document.create.header(ELEMENT_NAME), classes) {

    open var isTransparent by this.toggleClass(TRANSPARENT_MODIFIER_NAME, isTransparent)

    companion object {

        const val ELEMENT_NAME = "mdl-layout__header"
        const val TRANSPARENT_MODIFIER_NAME = "mdl-layout__header--transparent"
    }
}
