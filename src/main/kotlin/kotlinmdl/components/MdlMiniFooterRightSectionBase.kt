package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlMiniFooterRightSectionBase<out T : Element> protected constructor(
        element: T,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlMiniFooterRightSection.ELEMENT_NAME) }, classes),
        IMdlMiniFooterRightSection<T>
