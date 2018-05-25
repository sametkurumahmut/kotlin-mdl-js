package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlTextFieldInput<out T : Element> : IMdlComponent<T> {

    companion object {

        const val ELEMENT_NAME = "mdl-textfield__input"
    }
}
