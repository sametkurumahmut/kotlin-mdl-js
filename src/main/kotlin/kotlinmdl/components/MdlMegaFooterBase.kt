package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import org.w3c.dom.Element

abstract class MdlMegaFooterBase<out T : Element> protected constructor(
        element: T,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlMegaFooter.BLOCK_NAME) }, classes), IMdlMegaFooter<T> {

    override var bottomSection: IMdlMegaFooterBottomSection<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)

    override var middleSection: IMdlMegaFooterMiddleSection<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)

    override var topSection: IMdlMegaFooterTopSection<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)
}
