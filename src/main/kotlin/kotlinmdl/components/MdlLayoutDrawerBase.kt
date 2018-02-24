package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import org.w3c.dom.Element

abstract class MdlLayoutDrawerBase<out T : Element> protected constructor(element: T, classes: String = String.empty)
    : MdlLayoutElement<T>(element.apply { classList.add(IMdlLayoutDrawer.ELEMENT_NAME) }, classes),
        IMdlLayoutDrawer<T> {

    override var layoutTitle: IMdlLayoutTitle<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)
}
