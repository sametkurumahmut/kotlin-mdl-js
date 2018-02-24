package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import org.w3c.dom.Element

abstract class MdlLayoutHeaderRowBase<out T : Element> protected constructor(element: T, classes: String = String.empty)
    : MdlLayoutElement<T>(element.apply { classList.add(IMdlLayoutHeaderRow.ELEMENT_NAME) }, classes),
        IMdlLayoutHeaderRow<T> {

    override var layoutTitle: IMdlLayoutTitle<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)
}
