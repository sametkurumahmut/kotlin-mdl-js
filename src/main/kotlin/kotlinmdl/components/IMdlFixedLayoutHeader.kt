package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlFixedLayoutHeader<out T : Element> : IMdlLayoutHeader<T> {

    var isSeamed: Boolean

    companion object {

        const val SEAMED_MODIFIER_NAME = "mdl-layout__header--seamed"
    }
}
