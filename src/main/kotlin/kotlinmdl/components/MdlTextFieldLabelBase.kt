package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.setTextContentOfThis
import org.w3c.dom.Element

abstract class MdlTextFieldLabelBase<out T : Element> protected constructor(
        element: T,
        text: String,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlTextFieldLabel.ELEMENT_NAME) }, classes),
        IMdlTextFieldLabel<T> {

    override var text by this.setTextContentOfThis(element, text)
}
