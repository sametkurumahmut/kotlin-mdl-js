package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlCardTitleBase<out T : Element> protected constructor(
        element: T,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty)
    : MdlCardElement<T>(element.apply { classList.add(IMdlCardTitle.ELEMENT_NAME) }, hasBorder, isExpandable, classes),
        IMdlCardTitle<T>
