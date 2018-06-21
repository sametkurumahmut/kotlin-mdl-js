package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlLayoutHeader<out T : Element> : IMdlLayoutElement<T> {

    var isTransparent: Boolean

    companion object {

        const val ELEMENT_NAME = "mdl-layout__header"
        const val TRANSPARENT_MODIFIER_NAME = "mdl-layout__header--transparent"
    }
}
