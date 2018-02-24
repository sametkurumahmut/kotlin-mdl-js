package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import kotlinx.html.dom.create
import kotlinx.html.js.header
import org.w3c.dom.HTMLElement
import kotlin.browser.document

open class MdlWaterfallLayoutHeader(
        isTopHideable: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty)
    : MdlLayoutHeader<HTMLElement>(document.create.header(), isTransparent, classes) {

    init {
        this.element.classList.add(MODIFIER_NAME)
    }

    open var isTopHideable by this.toggleClassOfThis(HIDE_TOP_MODIFIER_NAME, isTopHideable)

    companion object {

        const val HIDE_TOP_MODIFIER_NAME = "mdl-layout__header--waterfall-hide-top"
        const val MODIFIER_NAME = "mdl-layout__header--waterfall"
    }
}
