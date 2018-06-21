package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import org.w3c.dom.Element

abstract class MdlMegaFooterMiddleSectionBase<out T : Element> protected constructor(
        element: T,
        classes: String = String.empty)
    : MdlMegaFooterVerticalSectionBase<T>(
        element.apply { classList.add(IMdlMegaFooterMiddleSection.ELEMENT_NAME) },
        classes), IMdlMegaFooterMiddleSection<T>
