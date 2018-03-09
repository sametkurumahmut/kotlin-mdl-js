package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import org.w3c.dom.Element

abstract class MdlMegaFooterVerticalSectionBase<out T : Element> protected constructor(
        element: T,
        classes: String = String.empty) : MdlComponent<T>(element, classes), IMdlMegaFooterVerticalSection<T> {

    override var leftSection: IMdlMegaFooterLeftSection<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)

    override var rightSection: IMdlMegaFooterRightSection<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)
}
