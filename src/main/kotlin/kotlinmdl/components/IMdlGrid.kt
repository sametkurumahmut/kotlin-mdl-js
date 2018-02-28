package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlGrid<out T : Element> : IMdlComponent<T> {

    var hasSpacing: Boolean

    companion object {

        const val BLOCK_NAME = "mdl-grid"
        const val NO_SPACING_MODIFIER_NAME = "mdl-grid--no-spacing"
    }
}
