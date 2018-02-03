package kotlinmdl.components

import kotlinmdl.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlLayoutDrawer(classes: String = String.empty)
    : MdlLayoutElement<HTMLDivElement>(document.create.div(ELEMENT_NAME), classes) {

    open var layoutTitle: MdlLayoutTitle? = null

    companion object {

        const val ELEMENT_NAME = "mdl-layout__drawer"
    }
}
