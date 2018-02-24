package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.setTextContentOfThis
import org.w3c.dom.Element

abstract class MdlLayoutTitleBase<out T : Element> protected constructor(
        element: T,
        title: String,
        classes: String = String.empty)
    : MdlLayoutElement<T>(element.apply { classList.add(IMdlLayoutTitle.BLOCK_NAME) }, classes), IMdlLayoutTitle<T> {

    override var title by this.setTextContentOfThis(element, title)
}
