package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlLayoutElement<out T : Element> protected constructor(element: T, classes: String = String.empty)
    : MdlComponent<T>(element, classes), IMdlLayoutElement<T> {

    override var isLargeScreenOnly by this.toggleClassOfThis(element, IMdlLayoutElement.LARGE_SCREEN_ONLY_MODIFIER_NAME)
    override var isSmallScreenOnly by this.toggleClassOfThis(element, IMdlLayoutElement.SMALL_SCREEN_ONLY_MODIFIER_NAME)
}
