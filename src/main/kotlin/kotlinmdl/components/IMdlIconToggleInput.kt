package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlIconToggleInput<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-icon-toggle__input"
    }
}
