package kotlinmdl.components

import kotlinmdl.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlLayoutSpacer(classes: String = String.empty)
    : MdlLayoutElement<HTMLDivElement>(document.create.div(BLOCK_NAME), classes) {

    companion object {

        const val BLOCK_NAME = "mdl-layout-spacer"
    }
}
