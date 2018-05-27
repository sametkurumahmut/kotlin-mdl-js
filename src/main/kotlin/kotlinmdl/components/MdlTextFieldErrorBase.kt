package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.setTextContentOfThis
import org.w3c.dom.Element

abstract class MdlTextFieldErrorBase<out T : Element> protected constructor(
        element: T,
        text: String,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlTextFieldError.ELEMENT_NAME) }, classes),
        IMdlTextFieldError<T> {

    override var text by this.setTextContentOfThis(element, text)
}
