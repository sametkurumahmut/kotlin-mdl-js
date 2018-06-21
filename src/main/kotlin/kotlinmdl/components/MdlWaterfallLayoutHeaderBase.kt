package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.toggleClassOfThis
import org.w3c.dom.Element

abstract class MdlWaterfallLayoutHeaderBase<out T : Element> protected constructor(
        element: T,
        isTopHideable: Boolean = false,
        isTransparent: Boolean = false,
        classes: String = String.empty)
    : MdlLayoutHeader<T>(
        element.apply { classList.add(IMdlWaterfallLayoutHeader.MODIFIER_NAME) },
        isTransparent,
        classes), IMdlWaterfallLayoutHeader<T> {

    override var isTopHideable
            by this.toggleClassOfThis(element, IMdlWaterfallLayoutHeader.HIDE_TOP_MODIFIER_NAME, isTopHideable)
}
