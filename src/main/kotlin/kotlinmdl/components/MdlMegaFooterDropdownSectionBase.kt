package kotlinmdl.components

import kotlinmdl.internal.extensions.empty
import kotlinmdl.internal.extensions.replaceOrAppendExistingChildOfThis
import org.w3c.dom.Element

abstract class MdlMegaFooterDropdownSectionBase<out T : Element> protected constructor(
        element: T,
        classes: String = String.empty)
    : MdlComponent<T>(element.apply { classList.add(IMdlMegaFooterDropdownSection.ELEMENT_NAME) }, classes),
        IMdlMegaFooterDropdownSection<T> {

    override var headingCheckBox: IMdlMegaFooterHeadingCheckBox<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)

    override var heading: IMdlMegaFooterHeading<Element>?
            by this.replaceOrAppendExistingChildOfThis(element, initialChildComponent = null)
}
