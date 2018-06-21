package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import org.w3c.dom.Element

abstract class MdlMiniFooterBase<out T : Element> protected constructor(
        element: T,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlMiniFooter.BLOCK_NAME) }, classes), IMdlMiniFooter<T> {

    override var leftSection: IMdlMiniFooterLeftSection<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)

    override var rightSection: IMdlMiniFooterRightSection<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)
}
