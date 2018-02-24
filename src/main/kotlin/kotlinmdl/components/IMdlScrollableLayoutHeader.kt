package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlScrollableLayoutHeader<out T : Element> : IMdlLayoutHeader<T> {

    companion object {

        const val MODIFIER_NAME = "mdl-layout__header--scroll"
    }
}
