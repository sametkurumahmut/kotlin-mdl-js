package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlLayoutHeader<out T : Element> protected constructor(
        element: T,
        isTransparent: Boolean = false,
        classes: String = String.empty)
    : MdlLayoutElement<T>(element.apply { classList.add(IMdlLayoutHeader.ELEMENT_NAME) }, classes),
        IMdlLayoutHeader<T> {

    override var isTransparent
            by this.toggleClassOfThis(element, IMdlLayoutHeader.TRANSPARENT_MODIFIER_NAME, isTransparent)
}
