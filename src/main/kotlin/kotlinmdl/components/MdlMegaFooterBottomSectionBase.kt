package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlMegaFooterBottomSectionBase<out T : Element> protected constructor(
        element: T,
        classes: String = String.empty)
    : MdlMegaFooterVerticalSectionBase<T>(
        element.apply { classList.add(IMdlMegaFooterBottomSection.ELEMENT_NAME) },
        classes), IMdlMegaFooterBottomSection<T>
