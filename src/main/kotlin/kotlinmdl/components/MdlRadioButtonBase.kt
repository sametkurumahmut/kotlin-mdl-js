package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlRadioButtonBase<out T : Element> protected constructor(
        element: T,
        id: String,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlRadioButton.ELEMENT_NAME) }, classes), IMdlRadioButton<T> {

    init {
        element.id = id
    }
}
