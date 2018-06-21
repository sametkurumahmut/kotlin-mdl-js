package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlLayoutTabBase<out T : Element> protected constructor(
        element: T,
        isActive: Boolean = false,
        classes: String = String.empty)
    : MdlLayoutElement<T>(element.apply { classList.add(IMdlLayoutTab.ELEMENT_NAME) }, classes), IMdlLayoutTab<T> {

    override var isActive by this.toggleClassOfThis(element, IMdlLayoutTab.IS_ACTIVE_MODIFIER_NAME, isActive)
}
