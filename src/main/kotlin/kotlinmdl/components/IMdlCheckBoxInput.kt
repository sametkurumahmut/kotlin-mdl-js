package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlCheckBoxInput<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-checkbox__input"
    }
}
