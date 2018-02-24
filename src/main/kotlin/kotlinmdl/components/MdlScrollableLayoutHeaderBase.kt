package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlScrollableLayoutHeaderBase<out T : Element> protected constructor(
        element: T,
        isTransparent: Boolean = false,
        classes: String = String.empty)
    : MdlLayoutHeader<T>(
        element.apply { classList.add(IMdlScrollableLayoutHeader.MODIFIER_NAME) },
        isTransparent,
        classes), IMdlScrollableLayoutHeader<T> {
}
