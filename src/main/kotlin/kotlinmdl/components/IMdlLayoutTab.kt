package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlLayoutTab<out T : Element> : IMdlLayoutElement<T> {

    var isActive: Boolean

    companion object {

        const val ELEMENT_NAME = "mdl-layout__tab"
        const val IS_ACTIVE_MODIFIER_NAME = "is-active"
    }
}
