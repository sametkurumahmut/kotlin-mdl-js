package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.setTextContentOfThis
import org.w3c.dom.Element

abstract class MdlRadioLabelBase<out T : Element> protected constructor(
        element: T,
        text: String,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlRadioLabel.ELEMENT_NAME) }, classes), IMdlRadioLabel<T> {

    override var text by this.setTextContentOfThis(element, text)
}
