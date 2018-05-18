package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlCardMediaBase<out T : Element> protected constructor(element: T, classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlCardMedia.ELEMENT_NAME) }, classes), IMdlCardMedia<T>
