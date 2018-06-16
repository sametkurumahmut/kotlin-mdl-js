package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlSwitchInput<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-switch__input"
    }
}
