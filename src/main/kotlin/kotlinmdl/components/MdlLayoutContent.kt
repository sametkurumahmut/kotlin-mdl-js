package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinx.html.dom.create
import kotlinx.html.js.div
import org.w3c.dom.HTMLDivElement
import kotlin.browser.document

open class MdlLayoutContent(
        open var title: String = String.empty,
        classes: String = String.empty,
        body: MdlLayoutContent.() -> Unit = {})
    : MdlLayoutElement<HTMLDivElement>(document.create.div(ELEMENT_NAME), classes) {

    init {
        this.body()
    }

    companion object {

        const val ELEMENT_NAME = "mdl-layout__content"
    }
}
