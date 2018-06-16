package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlSwitchInputBase<out T : Element> protected constructor(
        element: T,
        id: String,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlSwitchInput.ELEMENT_NAME) }, classes), IMdlSwitchInput<T> {

    init {
        element.id = id
    }
}
