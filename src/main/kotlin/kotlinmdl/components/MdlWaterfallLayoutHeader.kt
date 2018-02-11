package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClass

open class MdlWaterfallLayoutHeader(
        isTopHideable: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty) : MdlLayoutHeader(isTransparent, classes) {

    init {
        this.element.classList.add(MODIFIER_NAME)
    }

    open var isTopHideable by this.toggleClass(HIDE_TOP_MODIFIER_NAME, isTopHideable)

    companion object {

        const val HIDE_TOP_MODIFIER_NAME = "mdl-layout__header--waterfall-hide-top"
        const val MODIFIER_NAME = "mdl-layout__header--waterfall"
    }
}
