package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlChipContact<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-chip__contact"
    }
}
