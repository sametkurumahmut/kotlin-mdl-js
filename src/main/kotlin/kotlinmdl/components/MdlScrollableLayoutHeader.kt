package kotlinmdl.components

import kotlinmdl.internal.extensions.empty

open class MdlScrollableLayoutHeader(isTransparent: Boolean = false, classes: String = String.empty)
    : MdlLayoutHeader(isTransparent, classes) {

    init {
        this.element.classList.add(MODIFIER_NAME)
    }

    companion object {

        const val MODIFIER_NAME = "mdl-layout__header--scroll"
    }
}
