package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.setTextContentOfThis
import kotlinx.html.dom.create
import kotlinx.html.js.span
import org.w3c.dom.HTMLSpanElement
import kotlin.browser.document

open class MdlLayoutTitle(title: String, classes: String = String.empty)
    : MdlLayoutElement<HTMLSpanElement>(document.create.span(BLOCK_NAME), classes) {

    open var title by this.setTextContentOfThis(title)

    companion object {

        const val BLOCK_NAME = "mdl-layout-title"
    }
}
