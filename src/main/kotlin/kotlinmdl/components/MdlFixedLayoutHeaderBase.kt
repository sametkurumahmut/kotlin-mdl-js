package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlFixedLayoutHeaderBase<out T : Element> protected constructor(
        element: T,
        isSeamed: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty)
    : MdlLayoutHeader<T>(element, isTransparent, classes), IMdlFixedLayoutHeader<T> {

    override var isSeamed by this.toggleClassOfThis(element, IMdlFixedLayoutHeader.SEAMED_MODIFIER_NAME, isSeamed)
}
