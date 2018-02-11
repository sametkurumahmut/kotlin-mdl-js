package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.nav
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlLayoutNav(classes: String = String.empty)
    : MdlLayoutElement<HTMLElement>(document.create.nav(BLOCK_NAME), classes) {

    companion object {

        const val BLOCK_NAME = "mdl-navigation"
    }
}
