package kotlinmdl.components

import kotlinmdl.extensions.empty
import kotlinmdl.extensions.toggleClass
import org.w3c.dom.Element

abstract class MdlLayoutElement<T>(element: T, classes: String = String.empty)
    : MdlComponent<T>(element, classes), IMdlLayoutElement where T : Element {

    override var isLargeScreenOnly by this.toggleClass(IMdlLayoutElement.LARGE_SCREEN_ONLY_MODIFIER_NAME)
    override var isSmallScreenOnly by this.toggleClass(IMdlLayoutElement.SMALL_SCREEN_ONLY_MODIFIER_NAME)
}
