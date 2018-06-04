package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlCheckBoxInputBase<out T : Element> protected constructor(
        element: T,
        id: String,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlCheckBoxInput.ELEMENT_NAME) }, classes), IMdlCheckBoxInput<T> {

    init {
        element.id = id
    }
}
