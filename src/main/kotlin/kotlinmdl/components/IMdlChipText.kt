package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlChipText<out T : Element> : IMdlComponent<T> {

    var text: String

    companion object {

        const val ELEMENT_NAME = "mdl-chip__text"
    }
}
