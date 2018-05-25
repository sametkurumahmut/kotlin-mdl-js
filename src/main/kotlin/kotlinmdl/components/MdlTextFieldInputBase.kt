package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlTextFieldInputBase<out T : Element> protected constructor(
        element: T, id: String, classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlTextFieldInput.ELEMENT_NAME) }, classes),
        IMdlTextFieldInput<T> {

    init {
        element.id = id
    }
}
