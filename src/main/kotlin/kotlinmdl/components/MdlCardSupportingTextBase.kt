package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.setTextContentOfThis
import org.w3c.dom.Element

abstract class MdlCardSupportingTextBase<out T : Element> protected constructor(
        element: T,
        text: String,
        hasBorder: Boolean = false,
        isExpandable: Boolean = false,
        classes: String = String.empty)
    : MdlCardElement<T>(
        element.apply { classList.add(IMdlCardSupportingText.ELEMENT_NAME) },
        hasBorder,
        isExpandable,
        classes), IMdlCardSupportingText<T> {

    override var text by this.setTextContentOfThis(element, text)
}
