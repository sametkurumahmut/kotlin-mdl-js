package kotlinmdl.components

import org.w3c.dom.Element

interface IMdlTextFieldError<out T : Element> : IMdlComponent<T> {

    var text: String

    companion object {

        const val ELEMENT_NAME = "mdl-textfield__error"
    }
}
