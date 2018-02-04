package kotlinmdl.components

import kotlinmdl.extensions.empty
import kotlinmdl.extensions.toggleClass

open class MdlFixedLayoutHeader(
        isSeamed: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty) : MdlLayoutHeader(isTransparent, classes) {

    open var isSeamed by this.toggleClass(SEAMED_MODIFIER_NAME, isSeamed)

    companion object {

        const val SEAMED_MODIFIER_NAME = "mdl-layout__header--seamed"
    }
}