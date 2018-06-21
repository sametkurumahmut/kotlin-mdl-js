package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlMegaFooterTopSectionBase<out T : Element> protected constructor(
        element: T,
        classes: String = String.empty)
    : MdlMegaFooterVerticalSectionBase<T>(
        element.apply { classList.add(IMdlMegaFooterTopSection.ELEMENT_NAME) },
        classes), IMdlMegaFooterTopSection<T>
