package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlCardElement<out T : Element> protected constructor(
        element: T,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty) : MdlComponent<T>(element, classes), IMdlCardElement<T> {

    override var hasBorder by this.toggleClassOfThis(element, IMdlCardElement.BORDER_MODIFIER_NAME, hasBorder)
    override var isExpandable by this.toggleClassOfThis(element, IMdlCardElement.EXPANDABLE_MODIFIER_NAME, isExpandable)
}
