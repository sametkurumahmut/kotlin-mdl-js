package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlIconToggleInputBase<out T : Element> protected constructor(
        element: T,
        id: String,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlIconToggleInput.ELEMENT_NAME) }, classes),
        IMdlIconToggleInput<T> {

    init {
        element.id = id
    }
}
