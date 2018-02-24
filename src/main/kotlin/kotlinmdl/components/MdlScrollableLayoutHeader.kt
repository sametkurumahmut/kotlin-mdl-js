package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.header
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlScrollableLayoutHeader(isTransparent: Boolean = false, classes: String = String.empty)
    : MdlLayoutHeader<HTMLElement>(document.create.header(), isTransparent, classes) {

    init {
        this.element.classList.add(MODIFIER_NAME)
    }

    companion object {

        const val MODIFIER_NAME = "mdl-layout__header--scroll"
    }
}
